package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uxx extends dtro {
    private MessageIdType a = bdhb.a;
    private long b;

    protected uxx() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "OutgoingReactionsQuery [messages.messages__id: %s,\n  message_reactions.message_reactions__id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        vef vefVar = (vef) dtsuVar;
        aB();
        this.cL = vefVar.cU();
        if (vefVar.di(0)) {
            this.a = new MessageIdType(vefVar.getLong(vefVar.cM(0, vek.a)));
            fY(0);
        }
        if (vefVar.di(1)) {
            this.b = vefVar.getLong(vefVar.cM(1, vek.a));
            fY(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uxx)) {
            return false;
        }
        uxx uxxVar = (uxx) obj;
        return super.aD(uxxVar.cL) && Objects.equals(this.a, uxxVar.a) && this.b == uxxVar.b;
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, Long.valueOf(this.b), null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "OutgoingReactionsQuery -- REDACTED") : a();
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
    }
}
