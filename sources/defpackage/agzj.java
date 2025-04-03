package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agzj extends dtro {
    private ConversationIdType a = bdgq.a;
    private long b = 0;
    private boolean c;

    protected agzj() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "SuperSortInnerQuery [conversations.conversations__id: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversation_pin.conversation_pin_pin_status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        ahfy ahfyVar = (ahfy) dtsuVar;
        aB();
        this.cL = ahfyVar.cU();
        if (ahfyVar.di(0)) {
            this.a = new ConversationIdType(ahfyVar.getLong(ahfyVar.cM(0, ahgi.a)));
            fY(0);
        }
        if (ahfyVar.di(1)) {
            this.b = ahfyVar.getLong(ahfyVar.cM(1, ahgi.a));
            fY(1);
        }
        if (ahfyVar.di(2)) {
            this.c = ahfyVar.getInt(ahfyVar.cM(2, ahgi.a)) == 1;
            fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof agzj)) {
            return false;
        }
        agzj agzjVar = (agzj) obj;
        return super.aD(agzjVar.cL) && Objects.equals(this.a, agzjVar.a) && this.b == agzjVar.b && this.c == agzjVar.c;
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, Long.valueOf(this.b), Boolean.valueOf(this.c), null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "SuperSortInnerQuery -- REDACTED") : a();
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
    }
}
