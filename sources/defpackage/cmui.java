package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class cmui extends dtro {
    private MessageIdType a;
    private MessageIdType b;
    private cmrv c;
    private cmrl d;
    private MessageIdType e;
    private int f;

    protected cmui() {
        MessageIdType messageIdType = bdhb.a;
        this.a = messageIdType;
        this.b = messageIdType;
        this.c = cmrv.b(0);
        this.e = messageIdType;
        this.f = 0;
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ReactionMessages [message_reactions.message_reactions_message_id: %s,\n  message_reactions.message_reactions_reacted_message_id: %s,\n  message_reactions.message_reactions_reaction: %s,\n  message_reactions.message_reactions_applied_reaction: %s,\n  messages.messages__id: %s,\n  messages.messages_message_status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        cnaz.c().intValue();
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        cmrl cmrlVar;
        cnas cnasVar = (cnas) dtsuVar;
        aB();
        this.cL = cnasVar.cU();
        if (cnasVar.di(0)) {
            this.a = new MessageIdType(cnasVar.getLong(cnasVar.cM(0, cnaz.a)));
            fY(0);
        }
        if (cnasVar.di(1)) {
            this.b = new MessageIdType(cnasVar.getLong(cnasVar.cM(1, cnaz.a)));
            fY(1);
        }
        if (cnasVar.di(2)) {
            this.c = cmrv.b(cnasVar.getInt(cnasVar.cM(2, cnaz.a)));
            fY(2);
        }
        if (cnasVar.di(3)) {
            byte[] blob = cnasVar.getBlob(cnasVar.cM(3, cnaz.a));
            if (blob == null) {
                cmrlVar = null;
            } else {
                try {
                    cmrlVar = (cmrl) eyfy.parseFrom(cmrl.a, blob, eyfc.a());
                } catch (Throwable unused) {
                    cmrlVar = cmrl.a;
                }
            }
            this.d = cmrlVar;
            fY(3);
        }
        if (cnasVar.di(4)) {
            this.e = new MessageIdType(cnasVar.getLong(cnasVar.cM(4, cnaz.a)));
            fY(4);
        }
        if (cnasVar.di(5)) {
            this.f = cnasVar.getInt(cnasVar.cM(5, cnaz.a));
            fY(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cmui)) {
            return false;
        }
        cmui cmuiVar = (cmui) obj;
        return super.aD(cmuiVar.cL) && Objects.equals(this.a, cmuiVar.a) && Objects.equals(this.b, cmuiVar.b) && this.c == cmuiVar.c && Objects.equals(this.d, cmuiVar.d) && Objects.equals(this.e, cmuiVar.e) && this.f == cmuiVar.f;
    }

    public final cmrl f() {
        az(3, "applied_reaction");
        return this.d;
    }

    public final cmrv g() {
        az(2, "reaction");
        return this.c;
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, this.d, this.e, Integer.valueOf(this.f), null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ReactionMessages -- REDACTED") : a();
    }
}
