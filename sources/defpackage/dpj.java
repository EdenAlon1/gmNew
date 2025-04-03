package defpackage;

import androidx.compose.foundation.gestures.DraggableElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpj {
    public static final ffjn a = new dpg(null);
    public static final ffjn b = new dph(null);

    public static /* synthetic */ hvi a(hvi hviVar, dpp dppVar, dqs dqsVar, boolean z, dwn dwnVar, boolean z2, ffjn ffjnVar, boolean z3, int i) {
        int i2 = i & 16;
        int i3 = i & 8;
        return hviVar.a(new DraggableElement(dppVar, dqsVar, z | (!((i & 4) == 0)), i3 != 0 ? null : dwnVar, (i2 == 0) & z2, (i & 32) != 0 ? a : null, (i & 64) != 0 ? b : ffjnVar, ((i & 128) == 0) & z3));
    }
}
