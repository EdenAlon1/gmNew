package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egsa {
    public final Context a;
    private final ffbz c = ffca.a(new ffix() { // from class: egrw
        @Override // defpackage.ffix
        public final Object invoke() {
            return Boolean.valueOf(fdui.a.a().b(egsa.this.a));
        }
    });
    private final ffbz d = ffca.a(new ffix() { // from class: egrx
        @Override // defpackage.ffix
        public final Object invoke() {
            return Boolean.valueOf(fdui.a.a().c(egsa.this.a));
        }
    });
    public final ffbz b = ffca.a(new ffix() { // from class: egry
        @Override // defpackage.ffix
        public final Object invoke() {
            return Boolean.valueOf(fdui.a.a().d(egsa.this.a));
        }
    });

    public egsa(Context context) {
        this.a = context;
        ffca.a(new ffix() { // from class: egrz
            @Override // defpackage.ffix
            public final Object invoke() {
                return fdui.a.a().a(egsa.this.a);
            }
        });
    }

    public final boolean a() {
        return ((Boolean) this.c.a()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.d.a()).booleanValue();
    }
}
