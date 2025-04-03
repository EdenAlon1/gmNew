package com.google.android.libraries.smartmessaging.expressivetext.impl;

import com.google.android.apps.common.proguard.UsedByNative;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface ExpressiveTextCallbackReceiver {
    @UsedByNative
    void onElementCountChanged(int i);

    @UsedByNative
    void onStrokeElementCountChanged(int i);

    @UsedByNative
    void onStrokeEnd();

    @UsedByNative
    void onStrokeStart();

    @UsedByNative
    void onTextElementTapped();

    @UsedByNative
    void onTransformEnd(float f, float f2);

    @UsedByNative
    void onTransformStart(float f, float f2);

    @UsedByNative
    void onTransformUpdate(float f, float f2);

    @UsedByNative
    void showTextEditingInterface(long j, String str, float f, float f2, float f3, float f4);
}
