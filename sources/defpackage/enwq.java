package defpackage;

import java.util.Calendar;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enwq extends enwr {
    private final enwp c;

    public enwq(enti entiVar, int i, enwp enwpVar) {
        super(entiVar, i);
        this.c = enwpVar;
        StringBuilder sb = new StringBuilder("%");
        entiVar.f(sb);
        sb.append(true != entiVar.d() ? 't' : 'T');
        sb.append(enwpVar.G);
    }

    @Override // defpackage.enwr
    public final void a(enws enwsVar, Object obj) {
        enwp enwpVar = this.c;
        if (!(obj instanceof Date) && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            entg.a(((entg) enwsVar).b, obj, "%t" + enwpVar.G);
            return;
        }
        enti entiVar = this.b;
        StringBuilder sb = new StringBuilder("%");
        entiVar.f(sb);
        sb.append(true != entiVar.d() ? 't' : 'T');
        sb.append(enwpVar.G);
        ((entg) enwsVar).b.append(String.format(entq.a, sb.toString(), obj));
    }
}
