package defpackage;

import android.content.Context;
import android.os.StatFs;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.io.File;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqlk {
    public static final cskc a = cskc.g("Bugle", "CopyFileTelephonyParts");
    public static final Pattern b = Pattern.compile("conversation_\\d+_message_\\d+_part_(\\d+)_.bin");
    private static final cfup d = cfvl.f(cfvl.b, "maximum_cache_size_bytes", 209715200);
    private static final cfup e = cfvl.f(cfvl.b, "minimum_available_free_disk_space", 314572800);
    public final errl c;
    private final Context f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;

    public cqlk(Context context, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.f = context;
        this.c = errlVar;
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
    }

    public static boolean d(File file) {
        try {
            return file.delete();
        } catch (Throwable th) {
            csjb e2 = a.e();
            e2.I("Unable to delete file");
            e2.A("file", file.getAbsolutePath());
            e2.s(th);
            return false;
        }
    }

    public final File a() {
        File file = new File(this.f.getCacheDir(), "telephony_cache");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void b(long j) {
        bwdf c = PartsTable.c();
        c.z("currentSizeUsage");
        c.h(new Function() { // from class: cqle
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar = (bwdm) obj;
                cskc cskcVar = cqlk.a;
                bwdmVar.l();
                int intValue = PartsTable.e().intValue();
                if (intValue < 52050) {
                    dtub.w("file_size_bytes", intValue);
                }
                bwdmVar.aq(new dtwe("parts.file_size_bytes", 7, 0L));
                return bwdmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        c.r();
        long j2 = c.b().j(PartsTable.d.R, "SUM");
        if (j2 > j || !e()) {
            bwdf c2 = PartsTable.c();
            c2.z("garbageCollectOldestUntilSizeIsMet1");
            c2.h(new Function() { // from class: cqli
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwdm bwdmVar = (bwdm) obj;
                    cskc cskcVar = cqlk.a;
                    bwdmVar.l();
                    return bwdmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            c2.e(new Function() { // from class: cqlg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwat bwatVar = (bwat) obj;
                    cskc cskcVar = cqlk.a;
                    return new bwau[]{bwatVar.a, bwatVar.S, bwatVar.R};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            c2.d(new bwdc(PartsTable.d.j, true));
            String str = (String) PartsTable.c.get(PartsTable.d.S.d());
            if (str == null) {
                throw new IllegalArgumentException("column null does not have a single index");
            }
            ((dtri) c2.a).c = str;
            final bwav bwavVar = (bwav) c2.b().o();
            while (bwavVar.moveToNext() && (j2 > j || !e())) {
                try {
                    String r = bwavVar.r();
                    emyw.e(r);
                    File file = new File(r);
                    if (!file.exists() || d(file)) {
                        bwdi bwdiVar = new bwdi();
                        bwdiVar.ap("garbageCollectOldestUntilSizeIsMet2");
                        bwdiVar.s();
                        bwdiVar.o();
                        bwdiVar.D(new Function() { // from class: cqlj
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bwdm bwdmVar = (bwdm) obj;
                                cskc cskcVar = cqlk.a;
                                bwdmVar.j(bwav.this.q());
                                return bwdmVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bwdiVar.b().e();
                        j2 -= bwavVar.e();
                    }
                } catch (Throwable th) {
                    try {
                        bwavVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            bwavVar.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01a9, code lost:
    
        if (r9.exists() != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ee, code lost:
    
        if (r9.exists() == false) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void c(final java.lang.String r19, android.net.Uri r20) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqlk.c(java.lang.String, android.net.Uri):void");
    }

    public final boolean e() {
        return new StatFs(a().getAbsolutePath()).getAvailableBytes() > ((Long) e.e()).longValue();
    }

    public final boolean f() {
        return ((ctud) this.g.b()).r() && ctid.i(this.f) && ((ctvb) this.h.b()).G();
    }
}
