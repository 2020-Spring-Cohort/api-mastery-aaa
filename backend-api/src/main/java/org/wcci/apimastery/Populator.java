package org.wcci.apimastery;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.apimastery.Classes.Sector;
import org.wcci.apimastery.Classes.Stock;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    private SectorRepository sectorRepository;
    @Autowired
    private StockRepository stockRepository;
    @Autowired
    private PriceRepository priceRepository;

    @Override
    public void run(String...args) throws Exception{
        Sector emergingMarkets = new Sector("Emerging Markets");
        sectorRepository.save(emergingMarkets);
        Sector healthCare = new Sector("HealthCare");
        sectorRepository.save(healthCare);
        Sector technology   = new Sector("Technology");
        sectorRepository.save(technology);
        Sector communicationServices = new Sector("Communication Services");
        sectorRepository.save(communicationServices);
        Sector energy = new Sector("Energy");
        sectorRepository.save(energy);
        Sector realEstate = new Sector("Real Estate");
        sectorRepository.save(realEstate);
        Sector financials = new Sector("Financials");
        sectorRepository.save(financials);

        Stock alibabGroupHolding = new Stock("Alibaba Group Holding",emergingMarkets,"BABA");
        stockRepository.save(alibabGroupHolding);
        Stock naspersLimited = new Stock("Naspers Limited",emergingMarkets,"NPSNY");
        stockRepository.save(naspersLimited);
        Stock mobilTeleSystems = new Stock("Mobiel TeleSystems",emergingMarkets,"MBT");
        stockRepository.save(mobilTeleSystems);
        Stock telkomIndonesia = new Stock("Telkom Indonesia",emergingMarkets,"TLK");
        stockRepository.save(telkomIndonesia);
        Stock taiwanSemiConductor = new Stock("Taiwan SemiConductor",emergingMarkets,"TSM");
        stockRepository.save(taiwanSemiConductor);
        Stock gileadSciencesInc = new Stock("Gilead Science Inc",healthCare,"GILD");
        stockRepository.save(gileadSciencesInc);
        Stock dentsplySironaInc = new Stock("Dentsply Sirona Inc",healthCare,"XRAY");
        stockRepository.save(dentsplySironaInc);
        Stock edwardsLifeSciences = new Stock("Edwards LifeSciences",healthCare,"EW");
        stockRepository.save(edwardsLifeSciences);
        Stock resMedInc = new Stock("ResMed Inc",healthCare,"RMD");
        stockRepository.save(resMedInc);
        Stock alexion = new Stock("Alexion",healthCare,"ALXN");
        stockRepository.save(alexion);
        Stock microsoftCorp = new Stock("Microsoft Corp",technology,"MSFT");
        stockRepository.save(microsoftCorp);
        Stock facebook = new Stock("Facebook",technology,"FB");
        stockRepository.save(facebook);
        Stock stMicroelectronics = new Stock("STMicroelectronics",technology,"STM");
        stockRepository.save(stMicroelectronics);
        Stock iacINteractiveCorp = new Stock("IAC Interactive Corp",technology,"IAC");
        stockRepository.save(iacINteractiveCorp);
        Stock theRubiconProject = new Stock("The Rubicon Project",technology,"RUBI");
        stockRepository.save(theRubiconProject);
        Stock artecGloblaMediaInc = new Stock("Artec Global Media Inc",communicationServices,"ACTL");
        stockRepository.save(artecGloblaMediaInc);
        Stock attInc = new Stock("AT&T Inc",communicationServices,"T");
        stockRepository.save(attInc);
        Stock atnInternational = new Stock("ATN International",communicationServices,"ATN");
        stockRepository.save(atnInternational);
        Stock atlanticInternetGroup = new Stock("Atlantis Internet Group",communicationServices,"ATIG");
        stockRepository.save(atlanticInternetGroup);
        Stock electronicArtsInc = new Stock("Electronic Arts Inc",communicationServices,"EA");
        stockRepository.save(electronicArtsInc);
        Stock hollyFrontierCorp = new Stock("HollyFrontier Corp",energy,"HFC");
        stockRepository.save(hollyFrontierCorp);
        Stock conocoPhillips = new Stock("ConocoPhilips",energy,"COP");
        stockRepository.save(conocoPhillips);
        Stock marathonPetroleumCorp = new Stock("Marathon Petroleum Corp",energy,"MPC");
        stockRepository.save(marathonPetroleumCorp);
        Stock chevronCorp = new Stock("Chevron Corp",energy,"CVX");
        stockRepository.save(chevronCorp);
        Stock kinderMorgan = new Stock("Kinder Morgan",energy,"KMI");
        stockRepository.save(kinderMorgan);
        Stock universalHealthRealty = new Stock("Universal Health Realty",realEstate,"UHT");
        stockRepository.save(universalHealthRealty);
        Stock equinix = new Stock("Equinix",realEstate,"EQIX");
        stockRepository.save(equinix);
        Stock outfrontMedia = new Stock("Outfront Media",realEstate,"OUT");
        stockRepository.save(outfrontMedia);
        Stock prologis = new Stock("Prologis",realEstate,"PLD");
        stockRepository.save(prologis);
        Stock safeHold = new Stock("SafeHold",realEstate,"SAFE");
        stockRepository.save(safeHold);
        Stock synchronyFinancial = new Stock("Synchrony Financial",financials,"SYF");
        stockRepository.save(synchronyFinancial);
        Stock chubbLtd = new Stock("Chubb Ltd",financials,"CB");
        stockRepository.save(chubbLtd);
        Stock progressiveCorp = new Stock("Progressive Corp",financials,"PGR");
        stockRepository.save(progressiveCorp);
        Stock msciInc = new Stock("MSCI Inc",financials,"MSCI");
        stockRepository.save(msciInc);
        Stock mastercardInc = new Stock("Mastercard Inc",financials,"MA");
        stockRepository.save(mastercardInc);






    }

}
