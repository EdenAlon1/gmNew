package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmpz extends dtro {
    private MessageIdType a = bdhb.a;

    protected bmpz() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "MessageIdsQueryWithReactions [messages.messages__id: %s\n]\n", String.valueOf(this.a));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bmwj bmwjVar = (bmwj) dtsuVar;
        aB();
        this.cL = bmwjVar.cU();
        if (bmwjVar.di(0)) {
            this.a = new MessageIdType(bmwjVar.getLong(bmwjVar.cM(0, bmwq.a)));
            super.fY(0);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmpz)) {
            return false;
        }
        bmpz bmpzVar = (bmpz) obj;
        return super.aD(bmpzVar.cL) && Objects.equals(this.a, bmpzVar.a);
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessageIdsQueryWithReactions -- REDACTED") : a();
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
    }
}
