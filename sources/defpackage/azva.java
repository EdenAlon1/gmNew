package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azva implements fbba {
    public static dtux a() {
        return new dtuf(azuy.d, "subscriptions", new dtue() { // from class: azuq
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = azuy.a;
                valueOf.getClass();
                if (i == 59230) {
                    azuy.e(dtveVar, 59230);
                    return;
                }
                if (i == 59450) {
                    dtveVar.y("ALTER TABLE subscriptions ADD COLUMN my_identity_token TEXT;");
                    dtveVar.y("CREATE INDEX index_subscriptions_my_identity_token ON subscriptions(my_identity_token);");
                } else {
                    if (i != 60160) {
                        return;
                    }
                    dtveVar.y("ALTER TABLE subscriptions ADD COLUMN my_identity_token_with_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                    dtveVar.y("CREATE INDEX index_subscriptions_my_identity_token_with_foreign_key ON subscriptions(my_identity_token_with_foreign_key);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
