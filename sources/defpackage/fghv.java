package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fghv {
    public static final fgho a = new fgho("NO_THREAD_ELEMENTS");
    private static final ffjm b = new ffjm() { // from class: fghs
        @Override // defpackage.ffjm
        public final Object a(Object obj, Object obj2) {
            ffha ffhaVar = (ffha) obj2;
            if (!(ffhaVar instanceof ffvh)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? ffhaVar : Integer.valueOf(intValue + 1);
        }
    };
    private static final ffjm c = new ffjm() { // from class: fght
        @Override // defpackage.ffjm
        public final Object a(Object obj, Object obj2) {
            ffvh ffvhVar = (ffvh) obj;
            ffha ffhaVar = (ffha) obj2;
            if (ffvhVar != null) {
                return ffvhVar;
            }
            if (ffhaVar instanceof ffvh) {
                return (ffvh) ffhaVar;
            }
            return null;
        }
    };
    private static final ffjm d = new ffjm() { // from class: fghu
        @Override // defpackage.ffjm
        public final Object a(Object obj, Object obj2) {
            fghy fghyVar = (fghy) obj;
            ffha ffhaVar = (ffha) obj2;
            if (ffhaVar instanceof ffvh) {
                ffvh ffvhVar = (ffvh) ffhaVar;
                Object a2 = ffvhVar.a(fghyVar.a);
                Object[] objArr = fghyVar.b;
                int i = fghyVar.d;
                objArr[i] = a2;
                ffvh[] ffvhVarArr = fghyVar.c;
                fghyVar.d = i + 1;
                ffvhVar.getClass();
                ffvhVarArr[i] = ffvhVar;
            }
            return fghyVar;
        }
    };

    public static final Object a(ffhd ffhdVar) {
        Object fold = ffhdVar.fold(0, b);
        fold.getClass();
        return fold;
    }

    public static final Object b(ffhd ffhdVar, Object obj) {
        if (obj == null) {
            obj = a(ffhdVar);
        }
        return obj == 0 ? a : obj instanceof Integer ? ffhdVar.fold(new fghy(ffhdVar, ((Number) obj).intValue()), d) : ((ffvh) obj).a(ffhdVar);
    }

    public static final void c(ffhd ffhdVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof fghy)) {
            Object fold = ffhdVar.fold(null, c);
            fold.getClass();
            ((ffvh) fold).b(ffhdVar, obj);
            return;
        }
        fghy fghyVar = (fghy) obj;
        int length = fghyVar.c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            ffvh ffvhVar = fghyVar.c[length];
            ffvhVar.getClass();
            ffvhVar.b(ffhdVar, fghyVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
