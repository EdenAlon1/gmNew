package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azuv extends duak {
    public azuv() {
        super("subscriptions");
    }

    public final azsu a() {
        return azsv.a(this.a.getAsString("my_identity_token"));
    }

    @Override // defpackage.duak
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final azuu b() {
        ah();
        try {
            if (a() != null) {
                e(a());
            }
            return new azuu(this.c, this.a, this.b, this.d.g(), this.e.g());
        } catch (Throwable th) {
            throw new dtqp(th);
        }
    }

    public final void d(azsu azsuVar) {
        int intValue = azuy.c().intValue();
        int intValue2 = azuy.c().intValue();
        if (intValue2 < 59450) {
            dtub.w("my_identity_token", intValue2);
        }
        if (intValue >= 59450) {
            if (azsuVar == null) {
                this.a.putNull("my_identity_token");
            } else {
                this.a.put("my_identity_token", azsv.b(azsuVar));
            }
        }
    }

    public final void e(azsu azsuVar) {
        int intValue = azuy.c().intValue();
        if (azuy.c().intValue() >= 60160 && intValue >= 60160) {
            if (azsuVar == null || azsuVar.equals(null)) {
                this.a.putNull("my_identity_token_with_foreign_key");
            } else {
                this.a.put("my_identity_token_with_foreign_key", azsv.b(azsuVar));
            }
        }
    }

    public final void f(String str) {
        dtub.u(this.a, "telephony_phone_number", str);
    }
}
