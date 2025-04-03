package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmjv extends dtro {
    private MessageIdType a = bdhb.a;

    protected bmjv() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "MessageIdsQueryBase [messages.messages__id: %s\n]\n", String.valueOf(this.a));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bmpp bmppVar = (bmpp) dtsuVar;
        aB();
        this.cL = bmppVar.cU();
        if (bmppVar.di(0)) {
            this.a = bmppVar.c();
            super.fY(0);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmjv)) {
            return false;
        }
        bmjv bmjvVar = (bmjv) obj;
        return super.aD(bmjvVar.cL) && Objects.equals(this.a, bmjvVar.a);
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessageIdsQueryBase -- REDACTED") : a();
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
    }
}
