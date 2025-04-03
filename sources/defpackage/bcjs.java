package defpackage;

import android.database.sqlite.SQLiteStatement;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcjs {
    public static final int a(dtyx dtyxVar, bckn bcknVar, long j, int i) {
        bcknVar.getClass();
        dtyxVar.n(bcknVar.b, "table_name");
        dtyxVar.n(new dtzq("$V", new Object[]{Long.valueOf(j)}), "status");
        return b(dtyxVar.b(), i);
    }

    public static final int b(dtzj dtzjVar, int i) {
        dtzjVar.getClass();
        String j = dtub.j(i);
        String[] strArr = bqea.a;
        dtzq dtzqVar = new dtzq("INSERT $R INTO $V ($V,$V,$V,$V) SELECT backup_id, bugle_id, table_name, status FROM ($V)", new Object[]{j, "backup_id_map", bqea.c.c.d(), bqea.c.d.d(), bqea.c.b.d(), bqea.c.e.d(), dtzjVar});
        dtve e = dtub.e("$primary");
        SQLiteStatement compileStatement = e.j().compileStatement(dtzqVar.ag(new dtzu(null, dtza.B().a(), true, null)));
        compileStatement.getClass();
        return e.c(compileStatement, new dtui("BackupIdMapTable-insert"));
    }

    public static /* synthetic */ dtvy c(dtry dtryVar, final bckn bcknVar, String str, boolean z, int i) {
        bcknVar.getClass();
        String[] strArr = bqea.a;
        bqdv bqdvVar = new bqdv(bqea.a);
        if ((i & 8) != 0) {
            bqdvVar.c(bqea.c.d);
        } else {
            bqdvVar.u();
        }
        if (z && ((i & 16) == 0)) {
            bqdvVar.d(new Function() { // from class: bcjo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bqdz bqdzVar = (bqdz) obj;
                    final bckn bcknVar2 = bckn.this;
                    bqdzVar.b(new Function() { // from class: bcjq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bqdz bqdzVar2 = (bqdz) obj2;
                            bqdzVar2.e(bckn.this.b);
                            return bqdzVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: bcjr
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bqdz bqdzVar2 = (bqdz) obj2;
                            bqdzVar2.g();
                            return bqdzVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return bqdzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            bqdvVar.d(new Function() { // from class: bcjp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bqdz bqdzVar = (bqdz) obj;
                    bqdzVar.e(bckn.this.b);
                    return bqdzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        if ((i & 4) != 0) {
            str = null;
        }
        dtvy i2 = dtvz.i(bqdvVar.b(), bqea.c.c, dtryVar);
        if (str != null) {
            ((dtrd) i2).e = str;
        }
        return i2;
    }
}
