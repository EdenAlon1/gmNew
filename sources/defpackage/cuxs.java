package defpackage;

import defpackage.cuxs;
import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuxs {
    static final emyl a;
    static final cuxl b;
    static final cfva c;
    static final emyl d;
    static final emyl e;
    public static final /* synthetic */ int f = 0;
    private static final String g;
    private static final cuxk h;
    private static final cuxl i;
    private static final Object j;
    private static final emyl k;

    /* compiled from: PG */
    public interface a {
        akzt ad();

        void iO();
    }

    static {
        String ch = Character.toString((char) 0);
        g = ch;
        cuxj cuxjVar = (cuxj) cuxk.a.createBuilder();
        cuxjVar.copyOnWrite();
        cuxk cuxkVar = (cuxk) cuxjVar.instance;
        cuxkVar.b |= 1;
        cuxkVar.c = "[\\u2000-\\u200A\\u1680\\u205F\\u3000]+([ \\t])";
        cuxjVar.copyOnWrite();
        cuxk cuxkVar2 = (cuxk) cuxjVar.instance;
        cuxkVar2.b |= 2;
        cuxkVar2.d = "$1";
        cuxjVar.copyOnWrite();
        cuxk.a((cuxk) cuxjVar.instance);
        cuxk cuxkVar3 = (cuxk) cuxjVar.build();
        h = cuxkVar3;
        a = cfvl.w("enable_replace_null_character");
        cuxi cuxiVar = (cuxi) cuxl.a.createBuilder();
        cuxiVar.a(cuxkVar3);
        cuxl cuxlVar = (cuxl) cuxiVar.build();
        i = cuxlVar;
        cuxi cuxiVar2 = (cuxi) cuxl.a.createBuilder();
        cuxiVar2.a(cuxkVar3);
        cuxj cuxjVar2 = (cuxj) cuxk.a.createBuilder();
        cuxjVar2.copyOnWrite();
        cuxk cuxkVar4 = (cuxk) cuxjVar2.instance;
        ch.getClass();
        cuxkVar4.b |= 1;
        cuxkVar4.c = ch;
        cuxjVar2.copyOnWrite();
        cuxk cuxkVar5 = (cuxk) cuxjVar2.instance;
        cuxkVar5.b |= 2;
        cuxkVar5.d = "";
        cuxjVar2.copyOnWrite();
        cuxk.a((cuxk) cuxjVar2.instance);
        cuxiVar2.copyOnWrite();
        cuxl cuxlVar2 = (cuxl) cuxiVar2.instance;
        cuxk cuxkVar6 = (cuxk) cuxjVar2.build();
        cuxkVar6.getClass();
        cuxlVar2.a();
        cuxlVar2.b.add(cuxkVar6);
        b = (cuxl) cuxiVar2.build();
        c = cfvl.u(cfvl.b, "text_sanitization_config", cuxlVar, new ecwg() { // from class: cuxn
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (cuxl) eyfy.parseFrom(cuxl.a, bArr);
            }
        });
        j = new Object();
        d = emys.a(new emyl() { // from class: cuxo
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = cuxs.f;
                ((cuxs.a) ctba.a(cuxs.a.class)).iO();
                Stream map = Collection.EL.stream(((cuxl) cuxs.c.e()).b).map(new cuxm());
                int i3 = engw.d;
                return (engw) map.collect(endq.a);
            }
        });
        e = emys.a(new emyl() { // from class: cuxp
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = cuxs.f;
                ((cuxs.a) ctba.a(cuxs.a.class)).iO();
                Stream map = Collection.EL.stream(cuxs.b.b).map(new cuxm());
                int i3 = engw.d;
                return (engw) map.collect(endq.a);
            }
        });
        k = emys.a(new emyl() { // from class: cuxq
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = cuxs.f;
                return ((cuxs.a) ctba.a(cuxs.a.class)).ad();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[Catch: all -> 0x008a, TryCatch #0 {, blocks: (B:6:0x0007, B:8:0x000f, B:10:0x0024, B:11:0x0035, B:12:0x003a, B:14:0x0040, B:15:0x004e, B:18:0x0056, B:20:0x005b, B:24:0x0065, B:26:0x0075, B:29:0x007b, B:35:0x002d), top: B:5:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r9) {
        /*
            emyl r0 = defpackage.cuxs.k
            if (r9 == 0) goto L8d
            java.lang.Object r1 = defpackage.cuxs.j
            monitor-enter(r1)
            emyl r2 = defpackage.cuxs.a     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L8a
            if (r3 == 0) goto L2d
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L8a
            cfup r2 = (defpackage.cfup) r2     // Catch: java.lang.Throwable -> L8a
            r2.getClass()     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r2 = r2.e()     // Catch: java.lang.Throwable -> L8a
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L8a
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L2d
            emyl r2 = defpackage.cuxs.e     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L8a
            engw r2 = (defpackage.engw) r2     // Catch: java.lang.Throwable -> L8a
            goto L35
        L2d:
            emyl r2 = defpackage.cuxs.d     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L8a
            engw r2 = (defpackage.engw) r2     // Catch: java.lang.Throwable -> L8a
        L35:
            enqv r2 = r2.iterator()     // Catch: java.lang.Throwable -> L8a
            r3 = 0
        L3a:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L8a
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L8a
            cuxr r4 = (defpackage.cuxr) r4     // Catch: java.lang.Throwable -> L8a
            java.util.regex.Matcher r5 = r4.b()     // Catch: java.lang.Throwable -> L8a
            r5.reset(r9)     // Catch: java.lang.Throwable -> L8a
            r6 = 0
        L4e:
            boolean r7 = r5.find()     // Catch: java.lang.Throwable -> L8a
            if (r7 == 0) goto L63
            if (r6 != 0) goto L5b
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L8a
            r6.<init>()     // Catch: java.lang.Throwable -> L8a
        L5b:
            java.lang.String r7 = r4.a()     // Catch: java.lang.Throwable -> L8a
            r5.appendReplacement(r6, r7)     // Catch: java.lang.Throwable -> L8a
            goto L4e
        L63:
            if (r6 == 0) goto L75
            boolean r9 = r4.c()     // Catch: java.lang.Throwable -> L8a
            r9 = r9 | r3
            java.lang.StringBuffer r3 = r5.appendTail(r6)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L8a
            r8 = r3
            r3 = r9
            r9 = r8
        L75:
            java.lang.String r4 = ""
            r5.reset(r4)     // Catch: java.lang.Throwable -> L8a
            goto L3a
        L7b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            if (r3 == 0) goto L89
            java.lang.Object r0 = r0.get()
            akzt r0 = (defpackage.akzt) r0
            java.lang.String r1 = "Bugle.Text.Sanitization.Success.Count"
            r0.c(r1)
        L89:
            return r9
        L8a:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            throw r9
        L8d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuxs.a(java.lang.String):java.lang.String");
    }
}
