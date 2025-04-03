package com.google.android.apps.messaging.ui.mediapicker.c2o;

import android.support.v7.widget.LinearLayoutManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ContentGridLayoutManager extends LinearLayoutManager {
    private final boolean a;

    public ContentGridLayoutManager() {
        super(1);
        this.a = true;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    public final boolean ag() {
        if (this.a) {
            return super.ag();
        }
        return false;
    }
}
