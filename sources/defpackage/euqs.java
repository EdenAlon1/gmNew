package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euqs implements eupo {
    public final Set a;
    public final eupo b;
    private final Set c;
    private final Set d;

    public euqs(eupm eupmVar, eupo eupoVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (euqd euqdVar : eupmVar.c) {
            if (euqdVar.a()) {
                if (euqdVar.b()) {
                    hashSet4.add(euqdVar.a);
                } else {
                    hashSet.add(euqdVar.a);
                }
            } else if (euqdVar.b()) {
                hashSet5.add(euqdVar.a);
            } else {
                hashSet2.add(euqdVar.a);
            }
        }
        if (!eupmVar.g.isEmpty()) {
            hashSet.add(new euqq(euqp.class, eust.class));
        }
        this.c = DesugarCollections.unmodifiableSet(hashSet);
        this.d = DesugarCollections.unmodifiableSet(hashSet2);
        DesugarCollections.unmodifiableSet(hashSet3);
        this.a = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        Set set = eupmVar.g;
        this.b = eupoVar;
    }

    @Override // defpackage.eupo
    public final euug a(euqq euqqVar) {
        throw null;
    }

    @Override // defpackage.eupo
    public final euug b(Class cls) {
        euqq euqqVar = new euqq(euqp.class, cls);
        if (this.d.contains(euqqVar)) {
            return this.b.a(euqqVar);
        }
        throw new euqf(String.format("Attempting to request an undeclared dependency Provider<%s>.", euqqVar));
    }

    @Override // defpackage.eupo
    public final euug c(euqq euqqVar) {
        throw null;
    }

    @Override // defpackage.eupo
    public final Object d(euqq euqqVar) {
        if (this.c.contains(euqqVar)) {
            return eupn.b(this.b, euqqVar);
        }
        throw new euqf(String.format("Attempting to request an undeclared dependency %s.", euqqVar));
    }

    @Override // defpackage.eupo
    public final Object e(Class cls) {
        if (!this.c.contains(new euqq(euqp.class, cls))) {
            throw new euqf(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object c = eupn.c(this.b, cls);
        if (!cls.equals(eust.class)) {
            return c;
        }
        return new euqr();
    }
}
