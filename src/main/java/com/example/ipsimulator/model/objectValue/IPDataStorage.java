package com.example.ipsimulator.model.objectValue;

import com.example.ipsimulator.model.entity.Transaction;
import com.example.ipsimulator.model.objectValue.order.stmt.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class IPDataStorage {

    private static final IPDataStorage ipDataStorage = new IPDataStorage();
    private Set<ReportEntry8> transaction008 = new HashSet<>();

    private Document stmt = new Document();

    private IPDataStorage(){}

    public static IPDataStorage getInstance(){
        return ipDataStorage;
    }

    public Set<ReportEntry8> getTransaction008() {
        return transaction008;
    }

    public void setTransaction008(String messageId , Set<Transaction> transactions){
        transaction008.clear();

        transactions.stream().forEach(t ->{
            ReportEntry8 entry8 = new ObjectFactory().createReportEntry8();
            entry8.setAmt(new ActiveOrHistoricCurrencyAndAmount());
            entry8.getAmt().setCcy("IRR");
            entry8.getAmt().setValue(t.getAmount());

            entry8.setCdtDbtInd(CreditDebitCode.DBIT);

            entry8.setRvslInd(false);

            entry8.setSts(EntryStatus2Code.BOOK);

            entry8.setValDt(new DateAndDateTimeChoice());
            entry8.getValDt().setDt("date");

            entry8.setBkTxCd(new BankTransactionCodeStructure4());
            entry8.getBkTxCd().setPrtry(new ProprietaryBankTransactionCodeStructure1());
            entry8.getBkTxCd().getPrtry().setCd("pacs.008.001.01");

            entry8.setChrgs(new Charges4());
            entry8.getChrgs().setRcrd(new ChargesRecord2());
            entry8.getChrgs().getRcrd().setAmt(new ActiveOrHistoricCurrencyAndAmount());
            entry8.getChrgs().getRcrd().getAmt().setCcy("IRR");
            entry8.getChrgs().getRcrd().getAmt().setValue(BigDecimal.valueOf(2000));

            entry8.setNtryDtls(new EntryDetails7());
            entry8.getNtryDtls().setTxDtls(new EntryTransaction8());
            entry8.getNtryDtls().getTxDtls().setRefs(new TransactionReferences3());
            entry8.getNtryDtls().getTxDtls().getRefs().setEndToEndId(t.getEntToEndID());
            entry8.getNtryDtls().getTxDtls().getRefs().setTxId("SABC14010322123324851238868");

            entry8.getNtryDtls().getTxDtls().setAmtDtls(new AmountAndCurrencyExchange3());
            entry8.getNtryDtls().getTxDtls().getAmtDtls().setTxAmt(new AmountAndCurrencyExchangeDetails3());
            entry8.getNtryDtls().getTxDtls().getAmtDtls().getTxAmt().setAmt(new ActiveOrHistoricCurrencyAndAmount());
            entry8.getNtryDtls().getTxDtls().getAmtDtls().getTxAmt().getAmt().setCcy("IRR");
            entry8.getNtryDtls().getTxDtls().getAmtDtls().getTxAmt().getAmt().setValue(BigDecimal.valueOf(30000));

            entry8.getNtryDtls().getTxDtls().setCdtDbtInd(CreditDebitCode.DBIT);

            entry8.getNtryDtls().getTxDtls().setRltdPties(new TransactionParties3());
            entry8.getNtryDtls().getTxDtls().getRltdPties().setDbtr(new PartyIdentification43());
            entry8.getNtryDtls().getTxDtls().getRltdPties().getDbtr().setNm(t.getDebtorName());

            entry8.getNtryDtls().getTxDtls().getRltdPties().setDbtrAcct(new CashAccount24());
            entry8.getNtryDtls().getTxDtls().getRltdPties().getDbtrAcct().setId(new AccountIdentification4Choice());
            entry8.getNtryDtls().getTxDtls().getRltdPties().getDbtrAcct().getId().setIBAN("IR670560611828005157572701");

            entry8.getNtryDtls().getTxDtls().getRltdPties().setCdtr(new PartyIdentification43());
            entry8.getNtryDtls().getTxDtls().getRltdPties().getCdtr().setNm(t.getCreditorName());

            entry8.getNtryDtls().getTxDtls().setRltdAgts(new TransactionAgents3());
            entry8.getNtryDtls().getTxDtls().getRltdAgts().setDbtrAgt(new BranchAndFinancialInstitutionIdentification5());
            entry8.getNtryDtls().getTxDtls().getRltdAgts().getDbtrAgt().setFinInstnId(new FinancialInstitutionIdentification8());
            entry8.getNtryDtls().getTxDtls().getRltdAgts().getDbtrAgt().getFinInstnId().setBICFI("SABCIRTHXXX");

            entry8.getNtryDtls().getTxDtls().getRltdAgts().getDbtrAgt().setBrnchId(new BranchData2());
            entry8.getNtryDtls().getTxDtls().getRltdAgts().getDbtrAgt().getBrnchId().setId("B6118-P03");

            entry8.getNtryDtls().getTxDtls().getRltdAgts().setCdtrAgt(new BranchAndFinancialInstitutionIdentification5());
            entry8.getNtryDtls().getTxDtls().getRltdAgts().getCdtrAgt().setFinInstnId(new FinancialInstitutionIdentification8());
            entry8.getNtryDtls().getTxDtls().getRltdAgts().getCdtrAgt().getFinInstnId().setBICFI("MELIIRTHXXX");
            entry8.getNtryDtls().getTxDtls().getRltdAgts().getCdtrAgt().setBrnchId(new BranchData2());
            entry8.getNtryDtls().getTxDtls().getRltdAgts().getCdtrAgt().getBrnchId().setId("B1708893-P01");

            transaction008.add(entry8);
        });


    }

    public void setStmt(Document document){
        this.stmt = document;
    }
    public Document getStmt(){
        return stmt;
    }



    public class CreditTransferTransactionInformation2ExtraData {
        ReportEntry8 reportEntry8;


        public CreditTransferTransactionInformation2ExtraData(ReportEntry8 reportEntry8) {
            this.reportEntry8 = reportEntry8;

        }

        public ReportEntry8 getCreditTransferTransactionInformation2() {
            return reportEntry8;
        }
    }
}
