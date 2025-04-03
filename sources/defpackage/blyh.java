package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class blyh extends dtro {
    private MessageIdType a = bdhb.a;

    protected blyh() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "MessageIdsQuery [messages.messages__id: %s\n]\n", String.valueOf(this.a));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bmjp bmjpVar = (bmjp) dtsuVar;
        aB();
        this.cL = bmjpVar.cU();
        if (bmjpVar.di(0)) {
            this.a = new MessageIdType(bmjpVar.getLong(bmjpVar.cM(0, bmju.a)));
            super.fY(0);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof blyh)) {
            return false;
        }
        blyh blyhVar = (blyh) obj;
        return super.aD(blyhVar.cL) && Objects.equals(this.a, blyhVar.a);
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessageIdsQuery -- REDACTED") : a();
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
    }
}
