package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvup extends dvuz {
    private final Bundle a;
    private final dvur b;

    public dvup(Bundle bundle, dvur dvurVar) {
        this.a = bundle;
        this.b = dvurVar;
    }

    @Override // defpackage.dvuz
    public final Bundle a() {
        return this.a;
    }

    @Override // defpackage.dvuz
    public final dvur b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvuz) {
            dvuz dvuzVar = (dvuz) obj;
            Bundle bundle = this.a;
            if (bundle != null ? bundle.equals(dvuzVar.a()) : dvuzVar.a() == null) {
                dvuzVar.c();
                dvuzVar.d();
                if (this.b.equals(dvuzVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Bundle bundle = this.a;
        return (((((bundle == null ? 0 : bundle.hashCode()) ^ 1000003) * (-721379959)) ^ 3) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "IntentBuilderParams{initialExtras=" + String.valueOf(this.a) + ", accountName=null, promoType=DIALOG, actionType=" + this.b.toString() + "}";
    }

    @Override // defpackage.dvuz
    public final void c() {
    }

    @Override // defpackage.dvuz
    public final void d() {
    }
}
