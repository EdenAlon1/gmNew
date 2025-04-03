package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class apyc {
    public static apyv a(apyd apydVar) {
        Object obj;
        Iterator<E> it = apydVar.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((apya) obj).c) {
                break;
            }
        }
        apya apyaVar = (apya) obj;
        if (apyaVar != null) {
            return apyaVar.a;
        }
        return null;
    }

    public static apyv b(apyd apydVar, aqux aquxVar) {
        Object obj;
        Object obj2;
        Iterator<E> it = apydVar.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Iterator<E> it2 = ((apya) obj).d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                aqux aquxVar2 = ((apxz) obj2).c;
                if (aquxVar2 != null && aquxVar2.w(aquxVar.g())) {
                    break;
                }
            }
            if (obj2 != null) {
                break;
            }
        }
        apya apyaVar = (apya) obj;
        if (apyaVar != null) {
            return apyaVar.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static apza c(apyd apydVar, aqux aquxVar) {
        apya apyaVar;
        apxz apxzVar;
        enqv it = apydVar.d().iterator();
        it.getClass();
        do {
            Object obj = null;
            if (!it.hasNext()) {
                return null;
            }
            apyaVar = (apya) it.next();
            Iterator<E> it2 = apyaVar.d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                aqux aquxVar2 = ((apxz) next).c;
                if (aquxVar2 != null && aquxVar2.w(aquxVar.g())) {
                    obj = next;
                    break;
                }
            }
            apxzVar = (apxz) obj;
        } while (apxzVar == null);
        return new apza(apyaVar.a, apxzVar);
    }
}
