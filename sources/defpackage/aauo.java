package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aauo implements abqq {
    public aaun a;
    public alxr b;
    public final aklf c;
    private final Set d;

    public aauo(aklf aklfVar, Set set) {
        aklfVar.getClass();
        this.c = aklfVar;
        this.d = set;
    }

    public final synchronized zvp a(alxr alxrVar, alxr alxrVar2, alxr alxrVar3) {
        Object obj;
        aaum aaumVar;
        zvu a;
        aaun aaunVar = this.a;
        if (alxrVar3 == null) {
            aaumVar = null;
        } else {
            enqu listIterator = ((enpx) this.d).listIterator();
            while (true) {
                if (!listIterator.hasNext()) {
                    obj = null;
                    break;
                }
                obj = listIterator.next();
                if (((aaum) obj).b(alxrVar, alxrVar3)) {
                    break;
                }
            }
            aaumVar = (aaum) obj;
        }
        boolean z = true;
        boolean z2 = aaunVar != null;
        if (aaumVar == null) {
            z = false;
        }
        if (z2 && z) {
            a = this.c.a(new aapy(alxrVar), null, null);
            aaun aaunVar2 = this.a;
            aaunVar2.getClass();
            aaumVar.getClass();
            aaunVar2.getClass();
            alxrVar3.getClass();
            this.a = new aaun(aaumVar.a(aaunVar2.a, alxrVar3), aaunVar2.b);
        } else if (z2) {
            aklf aklfVar = this.c;
            aaun aaunVar3 = this.a;
            aaunVar3.getClass();
            aaunVar3.getClass();
            a = aklfVar.a(aaunVar3.a, aaunVar3.b, alxrVar3);
            this.a = null;
        } else if (z) {
            zvu a2 = this.c.a(new aapy(alxrVar), null, null);
            aaumVar.getClass();
            alxrVar3.getClass();
            this.a = new aaun(aaumVar.a(alxrVar, alxrVar3), alxrVar2);
            a = a2;
        } else {
            a = this.c.a(alxrVar, alxrVar2, alxrVar3);
        }
        return a;
    }

    @Override // defpackage.abqq, java.lang.AutoCloseable
    public final void close() {
        this.a = null;
        this.b = null;
    }
}
