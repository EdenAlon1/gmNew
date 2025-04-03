package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class psm extends pql {
    private static final String h = ppt.d("WorkContinuationImpl");
    public final pte a;
    public final String b;
    public final ppa c;
    public final List d;
    public final List e;
    public final List f;
    public boolean g;
    private pqb i;

    public psm(pte pteVar, String str, ppa ppaVar, List list) {
        this(pteVar, str, ppaVar, list, null);
    }

    @Override // defpackage.pql
    public final pqb a() {
        if (this.g) {
            ppt.c();
            Log.w(h, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        } else {
            this.i = pqf.a(this.a.d.m, "EnqueueRunnable_".concat(String.valueOf(this.c.name())), this.a.m.a, new ffix() { // from class: psl
                @Override // defpackage.ffix
                public final Object invoke() {
                    pzv.a(psm.this);
                    return ffcu.a;
                }
            });
        }
        return this.i;
    }

    public psm(pte pteVar, String str, ppa ppaVar, List list, byte[] bArr) {
        this.a = pteVar;
        this.b = str;
        this.c = ppaVar;
        this.d = list;
        this.e = new ArrayList(list.size());
        this.f = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (ppaVar == ppa.REPLACE && ((pqv) list.get(i)).b.w != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String a = ((pqv) list.get(i)).a();
            this.e.add(a);
            this.f.add(a);
        }
    }
}
