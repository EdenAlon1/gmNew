package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hrm extends ffkk implements ffji {
    public static final hrm a = new hrm();

    public hrm() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        synchronized (hsj.c) {
            List list = hsj.h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((ffji) list.get(i)).invoke(obj);
            }
        }
        return ffcu.a;
    }
}
