package defpackage;

import com.google.android.libraries.messaging.lighter.ui.messagelist.MessageListView;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eacx implements eacl {
    public final eace a;
    public final eadd b;
    public final engw c;
    public eack d;
    public eaac e;
    private final engw f;

    public eacx(MessageListView messageListView, dzpt dzptVar, dzja dzjaVar, dyil dyilVar, dyiu dyiuVar, eace eaceVar, engw engwVar) {
        new HashMap();
        new HashMap();
        if (!dzjaVar.c().g().contains(dzptVar.a())) {
            throw new IllegalArgumentException("Conversation owner doesn't belong to the account context primary passed in");
        }
        this.a = eaceVar;
        dyiuVar.a(dzptVar);
        engr engrVar = new engr();
        enou enouVar = (enou) engwVar;
        int i = enouVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            engrVar.h(((each) engwVar.get(i2)).a());
        }
        engw g = engrVar.g();
        this.f = g;
        emxc emxcVar = messageListView.ae;
        eadd eaddVar = new eadd(eaceVar, g, new eacv(this), new eacw(this), dzjaVar, dzptVar, dyilVar, dyiuVar);
        this.b = eaddVar;
        messageListView.am(eaddVar);
        eaddVar.e = messageListView.ad;
        new ersb(dyhp.b().a);
        engr engrVar2 = new engr();
        int i3 = enouVar.c;
        for (int i4 = 0; i4 < i3; i4++) {
            each eachVar = (each) engwVar.get(i4);
            if (eachVar.b().g()) {
                engrVar2.h((eacg) eachVar.b().c());
            }
        }
        engw g2 = engrVar2.g();
        this.c = g2;
        int i5 = ((enou) g2).c;
        for (int i6 = 0; i6 < i5; i6++) {
            eacg eacgVar = (eacg) g2.get(i6);
            eacgVar.b();
            eacgVar.a();
        }
    }

    @Override // defpackage.eacl
    public final void a(eaci eaciVar) {
        eadd eaddVar = this.b;
        if (eaddVar.f.containsKey(eaciVar)) {
            eaddVar.f.remove(eaciVar);
            eaddVar.H();
        }
    }
}
