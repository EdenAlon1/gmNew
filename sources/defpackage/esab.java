package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esab extends eyfq implements eyht {
    public esab() {
        super(esac.a);
    }

    public final void a(erzn erznVar) {
        copyOnWrite();
        esac esacVar = (esac) this.instance;
        esac esacVar2 = esac.a;
        erznVar.getClass();
        eygr eygrVar = esacVar.b;
        if (!eygrVar.c()) {
            esacVar.b = eyfy.mutableCopy(eygrVar);
        }
        esacVar.b.add(erznVar);
    }
}
