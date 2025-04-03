package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wug implements wqq {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/actions/deletemessage/DeleteMessageActionPlugin");
    public final Context b;
    public final ConversationId c;
    public final ffbr d;
    public final alye e;
    public final ffsk f;
    public final aawu g;
    public final auog h;
    public dmvi i;
    public final aaad j;
    public int k;
    private final ajjc l;
    private final deaj m;
    private final cuxz n;
    private final asix o;
    private final ffxx p;
    private final fgcq q;
    private final auol r;
    private final ffxx s;
    private final ffxx t;
    private final Set u;

    public wug(Context context, ConversationId conversationId, ffbr ffbrVar, ajjc ajjcVar, deaj deajVar, alye alyeVar, ffsk ffskVar, aawu aawuVar, cuxz cuxzVar, asix asixVar, cslr cslrVar, ffxx ffxxVar, fgcq fgcqVar, auol auolVar, auog auogVar, aaad aaadVar, ffxx ffxxVar2) {
        context.getClass();
        conversationId.getClass();
        ffbrVar.getClass();
        ajjcVar.getClass();
        deajVar.getClass();
        alyeVar.getClass();
        ffskVar.getClass();
        aawuVar.getClass();
        cuxzVar.getClass();
        asixVar.getClass();
        cslrVar.getClass();
        fgcqVar.getClass();
        auolVar.getClass();
        aaadVar.getClass();
        ffxxVar2.getClass();
        this.b = context;
        this.c = conversationId;
        this.d = ffbrVar;
        this.l = ajjcVar;
        this.m = deajVar;
        this.e = alyeVar;
        this.f = ffskVar;
        this.g = aawuVar;
        this.n = cuxzVar;
        this.o = asixVar;
        this.p = ffxxVar;
        this.q = fgcqVar;
        this.r = auolVar;
        this.h = auogVar;
        this.j = aaadVar;
        this.s = ffxxVar2;
        this.k = 1;
        String string = context.getString(R.string.rcs_delete_message_confirmation_dialog_title);
        string.getClass();
        ffel ffelVar = ffel.a;
        String string2 = context.getString(R.string.delete_message_confirmation_button);
        string2.getClass();
        doas doasVar = new doas(string2, new ffix() { // from class: wtr
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        });
        String string3 = context.getString(android.R.string.cancel);
        string3.getClass();
        this.i = new dmvi(string, ffelVar, null, null, doasVar, new doas(string3, new ffix() { // from class: wts
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }), null, 76);
        this.t = auolVar.a() ? fgck.b(ffxxVar2, aawuVar.a(), fgcqVar, ffxxVar, new wtz(this, null)) : new fgch(ffxxVar2, aawuVar.a(), new wuc(this, null));
        this.u = fffi.d(aaxf.b, aaxf.c, aaxf.d, aaxf.e);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.u;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wug.c(java.util.List, ffgu):java.lang.Object");
    }

    public final List d(final ajiy ajiyVar) {
        final int i = 2;
        dnia[] dniaVarArr = new dnia[2];
        String string = this.b.getString(R.string.delete_for_everyone);
        string.getClass();
        String string2 = this.b.getString(R.string.delete_for_everyone_info);
        int i2 = this.k;
        final int i3 = 1;
        dniaVarArr[0] = new dnia(string, string2, i2 == 1, new ffix() { // from class: wtv
            @Override // defpackage.ffix
            public final Object invoke() {
                wug wugVar = wug.this;
                wugVar.k = i3;
                dmvi dmviVar = wugVar.i;
                ajiy ajiyVar2 = ajiyVar;
                wugVar.i = dmvi.b(dmviVar, null, wugVar.d(ajiyVar2), null, null, null, null, 125);
                ajiyVar2.b(wugVar.i);
                return ffcu.a;
            }
        });
        String string3 = this.b.getString(R.string.delete_for_me);
        string3.getClass();
        int i4 = this.k;
        dniaVarArr[1] = new dnia(string3, null, i4 == 2, new ffix() { // from class: wtv
            @Override // defpackage.ffix
            public final Object invoke() {
                wug wugVar = wug.this;
                wugVar.k = i;
                dmvi dmviVar = wugVar.i;
                ajiy ajiyVar2 = ajiyVar;
                wugVar.i = dmvi.b(dmviVar, null, wugVar.d(ajiyVar2), null, null, null, null, 125);
                ajiyVar2.b(wugVar.i);
                return ffcu.a;
            }
        });
        return ffdx.g(dniaVarArr);
    }

    public final void e(final List list, boolean z, final ffix ffixVar) {
        if (!this.n.c(this.b)) {
            this.m.a();
            return;
        }
        if (z) {
            this.l.d(true, new ffji() { // from class: wtu
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    final ajiy ajiyVar = (ajiy) obj;
                    ajiyVar.getClass();
                    final wug wugVar = wug.this;
                    dmvi dmviVar = wugVar.i;
                    List d = wugVar.d(ajiyVar);
                    String string = wugVar.b.getString(R.string.delete_message_confirmation_button);
                    string.getClass();
                    final List list2 = list;
                    final ffix ffixVar2 = ffixVar;
                    doas doasVar = new doas(string, new ffix() { // from class: wtt
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            wug wugVar2 = wug.this;
                            axol.k(wugVar2.f, null, new wue(wugVar2, list2, ffixVar2, null), 3);
                            ajiyVar.a();
                            return ffcu.a;
                        }
                    });
                    String string2 = wugVar.b.getString(android.R.string.cancel);
                    string2.getClass();
                    wugVar.i = dmvi.b(dmviVar, null, d, null, doasVar, new doas(string2, new ffix() { // from class: wtw
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            ajiy.this.a();
                            return ffcu.a;
                        }
                    }), null, 77);
                    return wugVar.i;
                }
            });
            return;
        }
        ajjc ajjcVar = this.l;
        String quantityString = this.b.getResources().getQuantityString(R.plurals.delete_message_confirmation_dialog_title, list.size(), Integer.valueOf(list.size()));
        String string = this.b.getString(R.string.delete_message_confirmation_dialog_text);
        string.getClass();
        String string2 = this.b.getString(R.string.delete_message_confirmation_button);
        string2.getClass();
        doas doasVar = new doas(string2, new ffix() { // from class: wtp
            @Override // defpackage.ffix
            public final Object invoke() {
                wug wugVar = wug.this;
                axol.k(wugVar.f, null, new wuf(wugVar, list, ffixVar, null), 3);
                return ffcu.a;
            }
        });
        String string3 = this.b.getString(android.R.string.cancel);
        string3.getClass();
        ajjcVar.c(new dmve(string, null, null, quantityString, false, false, doasVar, new doas(string3, new ffix() { // from class: wtq
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }), null, 310), true);
    }
}
