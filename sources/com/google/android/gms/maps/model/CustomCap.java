package com.google.android.gms.maps.model;

import defpackage.dfwv;
import defpackage.dhcc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CustomCap extends Cap {
    public final dhcc c;
    public final float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCap(dhcc dhccVar, float f) {
        super(3, dhccVar, Float.valueOf(f));
        dfwv.o(dhccVar, "bitmapDescriptor must not be null");
        if (f <= 0.0f) {
            throw new IllegalArgumentException("refWidth must be positive");
        }
        this.c = dhccVar;
        this.d = f;
    }

    @Override // com.google.android.gms.maps.model.Cap
    public final String toString() {
        return "[CustomCap: bitmapDescriptor=" + String.valueOf(this.c) + " refWidth=" + this.d + "]";
    }
}
