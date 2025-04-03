package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlk extends hmq {
    public static final hlk a = new hlk();

    private hlk() {
        super(0, 2, 1);
    }

    @Override // defpackage.hmq
    protected final void a(hmv hmvVar, hep hepVar, hjv hjvVar, hjj hjjVar, hmr hmrVar) {
        int i = ((hpz) hmvVar.c(0)).a;
        List list = (List) hmvVar.c(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            hepVar.i(i3, obj);
            hepVar.j(i3, obj);
        }
    }
}
