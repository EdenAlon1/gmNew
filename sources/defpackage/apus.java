package defpackage;

import java.security.InvalidParameterException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class apus implements alxw {
    public abstract int a();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        alxw alxwVar = (alxw) obj;
        if (alxwVar instanceof apus) {
            return Integer.compare(a(), ((apus) alxwVar).a());
        }
        throw new InvalidParameterException("wrong PagingKey type, expected PositionalPagingKey");
    }
}
