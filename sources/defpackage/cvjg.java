package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvjg {
    public static final cfva a = cfvl.n(cfvl.b, "simulate_manufacturer_with_watch_texting", false);
    public final Context b;
    public final ffbz c;
    public final ffbz d;
    public final ffbz e;
    private final ffbr f;
    private final ffbr g;
    private final ffbz h;

    public cvjg(Context context, ffbr ffbrVar, ffbr ffbrVar2) {
        context.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.b = context;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffca.a(new ffix() { // from class: cvja
            @Override // defpackage.ffix
            public final Object invoke() {
                return Boolean.valueOf(cvjg.this.b.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
            }
        });
        this.c = ffca.a(new ffix() { // from class: cvjb
            @Override // defpackage.ffix
            public final Object invoke() {
                cvjg cvjgVar = cvjg.this;
                boolean z = false;
                if (cvjgVar.a() && cvjgVar.b.getPackageManager().hasSystemFeature("com.google.android.feature.p11")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        this.d = ffca.a(new ffix() { // from class: cvjc
            @Override // defpackage.ffix
            public final Object invoke() {
                cvjg cvjgVar = cvjg.this;
                boolean z = false;
                if (cvjgVar.a() && ctib.a() && !((Boolean) cvjgVar.c.a()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf((!cvjgVar.b()) & z);
            }
        });
        ffca.a(new ffix() { // from class: cvjd
            @Override // defpackage.ffix
            public final Object invoke() {
                cvjg cvjgVar = cvjg.this;
                boolean z = false;
                if (cvjgVar.a() && ctib.d()) {
                    z = true;
                }
                if (cvjgVar.b()) {
                    z = cvjgVar.a();
                }
                return Boolean.valueOf(z);
            }
        });
        ffca.a(new ffix() { // from class: cvje
            @Override // defpackage.ffix
            public final Object invoke() {
                boolean e;
                if (cvjg.this.b()) {
                    e = false;
                } else {
                    String str = Build.DEVICE;
                    str.getClass();
                    e = emuz.e("eos", str);
                }
                return Boolean.valueOf(e);
            }
        });
        this.e = ffca.a(new ffix() { // from class: cvjf
            @Override // defpackage.ffix
            public final Object invoke() {
                boolean e;
                if (cvjg.this.b()) {
                    e = false;
                } else {
                    String str = Build.DEVICE;
                    str.getClass();
                    e = emuz.e("r11", str);
                }
                return Boolean.valueOf(e);
            }
        });
    }

    public final boolean a() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    public final boolean b() {
        if (((Boolean) a.e()).booleanValue()) {
            return true;
        }
        return ((Boolean) this.g.b()).booleanValue();
    }
}
