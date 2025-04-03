package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akym extends akyh {
    private final emyl a;

    public akym(emyl emylVar) {
        this.a = emylVar;
    }

    @Override // defpackage.akyh
    public final boolean a(alan alanVar) {
        double nextDouble = ((Random) this.a.get()).nextDouble();
        alax alaxVar = alanVar.c;
        if (alaxVar == null) {
            alaxVar = alax.a;
        }
        return nextDouble < alaxVar.c;
    }
}
