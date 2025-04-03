package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jar implements ViewTranslationCallback {
    public static final jar a = new jar();

    private jar() {
    }

    public final boolean onClearTranslation(View view) {
        int i;
        ffix ffixVar;
        view.getClass();
        hwu hwuVar = ((AndroidComposeView) view).n;
        hwuVar.h = 1;
        cmy g = hwuVar.g();
        Object[] objArr = g.c;
        long[] jArr = g.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            jjn jjnVar = ((jft) objArr[(i2 << 3) + i4]).a.c;
                            jku jkuVar = jkm.a;
                            if (jjo.a(jjnVar, jkm.B) != null) {
                                jku jkuVar2 = jjl.a;
                                jjb jjbVar = (jjb) jjo.a(jjnVar, jjl.m);
                                if (jjbVar != null && (ffixVar = (ffix) jjbVar.b) != null) {
                                }
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }

    public final boolean onHideTranslation(View view) {
        int i;
        ffji ffjiVar;
        view.getClass();
        hwu hwuVar = ((AndroidComposeView) view).n;
        hwuVar.h = 1;
        cmy g = hwuVar.g();
        Object[] objArr = g.c;
        long[] jArr = g.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            jjn jjnVar = ((jft) objArr[(i2 << 3) + i4]).a.c;
                            jku jkuVar = jkm.a;
                            if (ffkj.e(jjo.a(jjnVar, jkm.B), true)) {
                                jku jkuVar2 = jjl.a;
                                jjb jjbVar = (jjb) jjo.a(jjnVar, jjl.l);
                                if (jjbVar != null && (ffjiVar = (ffji) jjbVar.b) != null) {
                                }
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }

    public final boolean onShowTranslation(View view) {
        int i;
        ffji ffjiVar;
        view.getClass();
        hwu hwuVar = ((AndroidComposeView) view).n;
        hwuVar.h = 2;
        cmy g = hwuVar.g();
        Object[] objArr = g.c;
        long[] jArr = g.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            jjn jjnVar = ((jft) objArr[(i2 << 3) + i4]).a.c;
                            jku jkuVar = jkm.a;
                            if (ffkj.e(jjo.a(jjnVar, jkm.B), false)) {
                                jku jkuVar2 = jjl.a;
                                jjb jjbVar = (jjb) jjo.a(jjnVar, jjl.l);
                                if (jjbVar != null && (ffjiVar = (ffji) jjbVar.b) != null) {
                                }
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }
}
