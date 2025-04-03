package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akdw extends ffhr {
    int a;
    int b;
    long c;
    /* synthetic */ Object d;
    final /* synthetic */ akee e;
    int f;
    akee g;
    eyja h;
    UUID i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akdw(akee akeeVar, ffgu ffguVar) {
        super(ffguVar);
        this.e = akeeVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
