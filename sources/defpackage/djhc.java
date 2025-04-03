package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djhc {
    public final djgy a;
    public final Object b = new Object();
    public final djha c;

    public djhc(djgy djgyVar, djha djhaVar) {
        this.a = djgyVar;
        this.c = djhaVar;
    }

    public static String c(Conversation conversation) {
        return conversation.c() == 2 ? conversation.b() : conversation.a().a();
    }

    public final djhe a(eiaa eiaaVar) {
        dkkj dkkjVar;
        Conversation b = eiaaVar.b();
        String c = c(b);
        djgn djgnVar = new djgn();
        synchronized (this.b) {
            dkkjVar = (dkkj) this.c.get(c);
            if (dkkjVar == null) {
                dkkjVar = this.a.createOutgoingSession(djhf.f(b.a()));
                dkkjVar.bm();
                dkkjVar.O = dkjj.CONFERENCE_URI;
                if (eiaaVar.e()) {
                    dkty.c("Updating CREATED GroupSession to support encryption", new Object[0]);
                    dkkjVar.aY(true);
                    dkkjVar.aX(true);
                }
                String b2 = b.b();
                String b3 = dkkjVar.ai() ? eeja.b() : b2;
                if (true != dkkjVar.ai()) {
                    b2 = null;
                }
                dkkjVar.y = b3;
                if (b2 != null) {
                    dkkjVar.z = b2;
                }
                djgnVar.a = 1;
                dkkjVar.aF(new djhb(this, c, dkkjVar));
                this.c.put(c, dkkjVar);
            } else {
                djgnVar.a = 2;
            }
        }
        djgnVar.b(dkkjVar);
        return djgnVar.a();
    }

    public final djhe b(Conversation conversation, dklp dklpVar) {
        synchronized (this.b) {
            String c = c(conversation);
            dkty.c("Using session key for incoming session: %s", dktx.PHONE_NUMBER.c(c));
            if (dklpVar instanceof dklm) {
                c = a.t(c, "standfw_");
            }
            dkkj dkkjVar = (dkkj) this.c.get(c);
            if (dkkjVar == null) {
                dklpVar.aF(new djhb(this, c, dklpVar));
                this.c.put(c, dklpVar);
                djgn djgnVar = new djgn();
                djgnVar.a = 1;
                djgnVar.b(dklpVar);
                return djgnVar.a();
            }
            String c2 = c(conversation);
            synchronized (this.b) {
                dklpVar.aF(new djhb(this, c2, dklpVar));
                this.c.put(c2, dklpVar);
            }
            djgn djgnVar2 = new djgn();
            djgnVar2.a = 3;
            djgnVar2.b(dkkjVar);
            return djgnVar2.a();
        }
    }
}
