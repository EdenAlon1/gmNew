package defpackage;

import java.security.InvalidParameterException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class aott implements alxw {
    public abstract long a();

    public abstract long b();

    public abstract long c();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        alxw alxwVar = (alxw) obj;
        if (!(alxwVar instanceof aott)) {
            throw new InvalidParameterException("wrong PagingKey type, expected BuglePagingKey");
        }
        aott aottVar = (aott) alxwVar;
        if (c() != aottVar.c()) {
            return c() <= aottVar.c() ? -1 : 1;
        }
        if (a() != aottVar.a()) {
            return a() <= aottVar.a() ? -1 : 1;
        }
        if (b() != aottVar.b()) {
            return b() <= aottVar.b() ? -1 : 1;
        }
        return 0;
    }

    final boolean d() {
        return b() > 0;
    }
}
