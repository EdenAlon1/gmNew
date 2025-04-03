package defpackage;

import j$.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffou extends ffcy implements Collection, java.util.Collection, fflg {
    final /* synthetic */ ffov a;

    public ffou(ffov ffovVar) {
        this.a = ffovVar;
    }

    @Override // defpackage.ffcy
    public final int a() {
        return this.a.a.groupCount() + 1;
    }

    public final ffor b(int i) {
        Matcher matcher = this.a.a;
        ffmj q = ffmk.q(matcher.start(i), matcher.end(i));
        if (q.d().intValue() < 0) {
            return null;
        }
        String group = this.a.a.group(i);
        group.getClass();
        return new ffor(group, q);
    }

    @Override // defpackage.ffcy, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null || (obj instanceof ffor)) {
            return super.contains((ffor) obj);
        }
        return false;
    }

    @Override // defpackage.ffcy, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<ffor> iterator() {
        return new ffoj((ffok) ffno.i(ffdx.as(new ffmj(0, a() - 1)), new ffot(this)));
    }
}
