package com.google.android.ims.rcsservice.chatsession.message;

import defpackage.evlh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class GeneralPurposeRichCardLayoutInfo {
    public static final int CARD_HEIGHT_UNSPECIFIED = -1;
    public static final String IMAGE_ALIGNMENT_LEFT = "LEFT";
    public static final String IMAGE_ALIGNMENT_RIGHT = "RIGHT";
    public static final String ORIENTATION_HORIZONTAL = "HORIZONTAL";
    public static final String ORIENTATION_VERTICAL = "VERTICAL";
    public static final String WIDTH_MEDIUM = "MEDIUM_WIDTH";
    public static final String WIDTH_SMALL = "SMALL_WIDTH";

    @evlh
    public String cardOrientation;

    @evlh
    public String cardWidth;
    public int desiredHeight = -1;

    @evlh
    public String imageAlignment;
}
