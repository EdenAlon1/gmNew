package com.google.android.libraries.inputmethod.emoji.picker;

import android.support.v7.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class EmojiPickerLayoutManager extends GridLayoutManager {
    public boolean J;

    public EmojiPickerLayoutManager(int i) {
        super(i, 1);
        this.J = true;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    public final boolean af() {
        return this.J && super.af();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    public final boolean ag() {
        return this.J && super.ag();
    }
}
