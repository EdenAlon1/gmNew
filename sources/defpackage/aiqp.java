package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiqp implements empj {
    private final cqoh a;
    private final List b;
    private final List c;
    private final int d;
    private final int e;

    public aiqp(cqoh cqohVar, List list, List list2, int i, int i2) {
        this.a = cqohVar;
        this.b = list;
        this.c = list2;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.empj
    public final ArrayList a(fbts fbtsVar, Locale locale) {
        locale.getClass();
        ArrayList arrayList = new ArrayList();
        fbxe fbxeVar = fbtsVar.o;
        if (fbxeVar == null) {
            fbxeVar = fbxe.a;
        }
        if (fbxeVar.b > 0) {
            fbxe fbxeVar2 = fbtsVar.o;
            if (fbxeVar2 == null) {
                fbxeVar2 = fbxe.a;
            }
            Instant ofEpochMilli = Instant.ofEpochMilli(fbxeVar2.b);
            ofEpochMilli.getClass();
            cqoh cqohVar = this.a;
            ZonedDateTime e = sth.e(ofEpochMilli);
            Instant b = sth.b(cqohVar);
            Instant plus = b.plus(Duration.ofDays(1L));
            ZonedDateTime e2 = sth.e(b);
            plus.getClass();
            if (ffkj.e(e, sth.e(plus))) {
                fbxe fbxeVar3 = fbtsVar.o;
                if (fbxeVar3 == null) {
                    fbxeVar3 = fbxe.a;
                }
                arrayList.add(aiqo.a(fbxeVar3.b));
                return arrayList;
            }
            if (ffkj.e(e, e2)) {
                List list = this.c;
                List ai = ffdx.ai(ffdx.ad(ffdx.ai(ffdx.c(list), this.e), ffdx.c(this.b)), this.d);
                ArrayList arrayList2 = new ArrayList(ffdx.n(ai, 10));
                Iterator it = ai.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((empl) it.next()).b(plus, fbrm.SUGGESTION_TAG_BIRTHDAY));
                }
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    @Override // defpackage.empj
    public final /* synthetic */ void b() {
    }
}
