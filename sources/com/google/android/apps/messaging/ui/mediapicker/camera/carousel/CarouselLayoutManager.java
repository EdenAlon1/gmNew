package com.google.android.apps.messaging.ui.mediapicker.camera.carousel;

import android.support.v7.widget.LinearLayoutManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CarouselLayoutManager extends LinearLayoutManager {
    public boolean a;

    public CarouselLayoutManager() {
        super(0);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    public final boolean af() {
        return !this.a && super.af();
    }
}
