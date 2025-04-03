package defpackage;

import java.security.InvalidParameterException;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class ambl implements amat {
    public abstract int a();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        amat amatVar = (amat) obj;
        if (amatVar instanceof ambl) {
            return Integer.compare(a(), ((ambl) amatVar).a());
        }
        throw new InvalidParameterException("wrong PagingKey type, expected an OffsetPagingKey");
    }
}
