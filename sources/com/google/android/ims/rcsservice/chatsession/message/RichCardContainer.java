package com.google.android.ims.rcsservice.chatsession.message;

import defpackage.csix;
import defpackage.diyy;
import defpackage.dizd;
import defpackage.dkta;
import defpackage.evlh;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RichCardContainer {
    public static final diyy<Boolean> USE_REFACTORED_RICH_CARD_CONTAINER = dizd.a(145728364);
    private String extractedDescription;
    private String extractedTitle;

    @evlh
    public GeneralPurposeRichCard generalPurposeCard;

    @evlh
    public GeneralPurposeRichCardCarousel generalPurposeCardCarousel;
    private List<GeneralPurposeRichCard> generalPurposeCards;

    public boolean containsCarousel() {
        return this.generalPurposeCardCarousel != null;
    }

    public boolean containsStandaloneCard() {
        return this.generalPurposeCard != null;
    }

    public String getExtractedDescription() {
        return this.extractedDescription;
    }

    public String getExtractedTitle() {
        return this.extractedTitle;
    }

    public List<GeneralPurposeRichCard> getGeneralPurposeCards() {
        csix.m(this.generalPurposeCards, "General purpose cards were requested but none were present.");
        List<GeneralPurposeRichCard> list = this.generalPurposeCards;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public GeneralPurposeRichCard getStandaloneCard() {
        if (((Boolean) USE_REFACTORED_RICH_CARD_CONTAINER.a()).booleanValue()) {
            if (containsStandaloneCard()) {
                return this.generalPurposeCard;
            }
            throw new IllegalStateException("There is no standalone card to return.");
        }
        List<GeneralPurposeRichCard> list = this.generalPurposeCards;
        if (list == null || list.size() <= 0) {
            throw new IllegalStateException("there is no card to return");
        }
        return this.generalPurposeCards.get(0);
    }

    public boolean hasGeneralPurposeCard() {
        return !dkta.a(this.generalPurposeCards);
    }

    public void setExtractedDescription(String str) {
        this.extractedDescription = str;
    }

    public void setExtractedTitle(String str) {
        this.extractedTitle = str;
    }

    public void setGeneralPurposeCards(List<GeneralPurposeRichCard> list) {
        this.generalPurposeCards = list;
    }
}
