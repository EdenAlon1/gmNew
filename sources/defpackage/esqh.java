package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esqh extends esqz {
    private String a;
    private esrd b;
    private Map c;
    private esqs d;
    private byte e;

    @Override // defpackage.esqz
    public final esrb a() {
        int i = ~this.e;
        if ((i & 1) != 0) {
            throw new IllegalStateException("Missing required properties: name");
        }
        String str = this.a;
        esrd esrdVar = this.b;
        Map map = this.c;
        esqs esqsVar = this.d;
        if ((i & 2) != 0) {
            esrdVar = esrd.b;
        }
        if ((i & 4) != 0) {
            map = ffem.a;
        }
        if ((i & 8) != 0) {
            esqsVar = esqs.a;
        }
        return new esrb(str, esrdVar, map, esqsVar);
    }

    @Override // defpackage.esqz
    public final void b(esqs esqsVar) {
        this.d = esqsVar;
        this.e = (byte) (this.e | 8);
    }

    @Override // defpackage.esqz
    public final void c(Map map) {
        this.c = map;
        this.e = (byte) (this.e | 4);
    }

    @Override // defpackage.esqz
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        this.e = (byte) (this.e | 1);
    }

    @Override // defpackage.esqz
    public final void e(esrd esrdVar) {
        if (esrdVar == null) {
            throw new NullPointerException("Null type");
        }
        this.b = esrdVar;
        this.e = (byte) (this.e | 2);
    }
}
