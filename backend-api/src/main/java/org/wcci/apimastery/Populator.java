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

        Stock alibabGroupHolding = new Stock("Alibaba Group Holding",emergingMarkets);
        stockRepository.save(alibabGroupHolding);
        Stock naspersLimited = new Stock("Naspers Limited",emergingMarkets);
        stockRepository.save(naspersLimited);
        Stock mobilTeleSystems = new Stock("Mobiel TeleSystems",emergingMarkets);
        stockRepository.save(mobilTeleSystems);
        Stock telkomIndonesia = new Stock("Telkom Indonesia",emergingMarkets);
        stockRepository.save(telkomIndonesia);
        Stock taiwanSemiConductor = new Stock("Taiwan SemiConductor",emergingMarkets);
        stockRepository.save(taiwanSemiConductor);
        Stock gileadSciencesInc = new Stock("Gilead Science Inc",healthCare);
        stockRepository.save(gileadSciencesInc);
        Stock dentsplySironaInc = new Stock("Dentsply Sirona Inc",healthCare);
        stockRepository.save(dentsplySironaInc);
        Stock edwardsLifeSciences = new Stock("Edwards LifeSciences",healthCare);
        stockRepository.save(edwardsLifeSciences);
        Stock resMedInc = new Stock("ResMed Inc",healthCare);
        stockRepository.save(resMedInc);
        Stock alexion = new Stock("Alexion",healthCare);
        stockRepository.save(alexion);
        Stock microsoftCorp = new Stock("Microsoft Corp",technology);
        stockRepository.save(microsoftCorp);
        Stock facebook = new Stock("Facebook",technology);
        stockRepository.save(facebook);
        Stock stMicroelectronics = new Stock("STMicroelectronics",technology);
        stockRepository.save(stMicroelectronics);
        Stock iacINteractiveCorp = new Stock("IAC Interactive Corp",technology);
        stockRepository.save(iacINteractiveCorp);
        Stock theRubiconProject = new Stock("The Rubicon Project",technology);
        stockRepository.save(theRubiconProject);
        Stock artecGloblaMediaInc = new Stock("Artec Global Media Inc",communicationServices);
        stockRepository.save(artecGloblaMediaInc);
        Stock attInc = new Stock("AT&T Inc",communicationServices);
        stockRepository.save(attInc);
        Stock atnInternational = new Stock("ATN International",communicationServices);
        stockRepository.save(atnInternational);
        Stock atlanticInternetGroup = new Stock("Atlantis Internet Group",communicationServices);
        stockRepository.save(atlanticInternetGroup);
        Stock electronicArtsInc = new Stock("Electronic Arts Inc",communicationServices);
        stockRepository.save(electronicArtsInc);
        Stock hollyFrontierCorp = new Stock("HollyFrontier Corp",energy);
        stockRepository.save(hollyFrontierCorp);
        Stock conocoPhillips = new Stock("ConocoPhilips",energy);
        stockRepository.save(conocoPhillips);
        Stock marathonPetroleumCorp = new Stock("Marathon Petroleum Corp",energy);
        stockRepository.save(marathonPetroleumCorp);
        Stock chevronCorp = new Stock("Chevron Corp",energy);
        stockRepository.save(chevronCorp);
        Stock kinderMorgan = new Stock("Kinder Morgan",energy);
        stockRepository.save(kinderMorgan);
        Stock universalHealthRealty = new Stock("Universal Health Realty",realEstate);
        stockRepository.save(universalHealthRealty);
        Stock equinix = new Stock("Equinix",realEstate);
        stockRepository.save(equinix);
        Stock outfrontMedia = new Stock("Outfront Media",realEstate);
        stockRepository.save(outfrontMedia);
        Stock prologis = new Stock("Prologis",realEstate);
        stockRepository.save(prologis);
        Stock safeHold = new Stock("SafeHold",realEstate);
        stockRepository.save(safeHold);
        Stock synchronyFinancial = new Stock("Synchrony Financial",financials);
        stockRepository.save(synchronyFinancial);
        Stock chubbLtd = new Stock("Chubb Ltd",financials);
        stockRepository.save(chubbLtd);
        Stock progressiveCorp = new Stock("Progressive Corp",financials);
        stockRepository.save(progressiveCorp);
        Stock msciInc = new Stock("MSCI Inc",financials);
        stockRepository.save(msciInc);
        Stock mastercardInc = new Stock("Mastercard Inc",financials);
        stockRepository.save(mastercardInc);






    }

}
