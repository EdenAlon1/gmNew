package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ymy implements ymb, xil, ybu {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/subjecturgent/SubjectUrgentUiAdapterImpl");
    public final ffsk b;
    public final ydb c;
    public final fgcm d;
    public ajiy e;
    public String f;
    public boolean g;
    public final dmvi h;
    private final Context i;
    private final ajjc j;
    private final xez k;
    private final avak l;
    private final fgdj m;
    private final dnmk n;
    private final dnem o;

    public ymy(Context context, ffsk ffskVar, ydb ydbVar, ajjc ajjcVar, xez xezVar, avak avakVar) {
        context.getClass();
        ffskVar.getClass();
        ydbVar.getClass();
        ajjcVar.getClass();
        this.i = context;
        this.b = ffskVar;
        this.c = ydbVar;
        this.j = ajjcVar;
        this.k = xezVar;
        this.l = avakVar;
        fgcm a2 = fgdm.a(false);
        this.d = a2;
        fgch fgchVar = new fgch(ffyy.a(new ymw(ydbVar.a, this)), a2, new ymx(this, null));
        int i = fgcz.a;
        this.m = fgbn.b(fgchVar, ffskVar, fgcy.b, null);
        this.f = "";
        String string = context.getString(R.string.subject_urgent_text_field_hint);
        string.getClass();
        this.n = new dnmk(string, this.f, new ffix() { // from class: ymd
            @Override // defpackage.ffix
            public final Object invoke() {
                ymy ymyVar = ymy.this;
                ymyVar.f = "";
                ajiy ajiyVar = ymyVar.e;
                if (ajiyVar == null) {
                    ffkj.c("popupController");
                    ajiyVar = null;
                }
                ajiyVar.b(ymyVar.d(ymyVar.h));
                return ffcu.a;
            }
        }, new ffji() { // from class: yme
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                ymy ymyVar = ymy.this;
                ymyVar.f = str;
                ajiy ajiyVar = ymyVar.e;
                if (ajiyVar == null) {
                    ffkj.c("popupController");
                    ajiyVar = null;
                }
                ajiyVar.b(ymyVar.d(ymyVar.h));
                return ffcu.a;
            }
        }, new dnmj(avakVar.a()));
        String string2 = context.getString(R.string.subject_urgent_urgent_checkbox);
        string2.getClass();
        dnem dnemVar = new dnem(string2, null, null, this.g, true, new ffix() { // from class: ymf
            @Override // defpackage.ffix
            public final Object invoke() {
                ymy ymyVar = ymy.this;
                ymyVar.g = !ymyVar.g;
                ajiy ajiyVar = ymyVar.e;
                if (ajiyVar == null) {
                    ffkj.c("popupController");
                    ajiyVar = null;
                }
                ajiyVar.b(ymyVar.d(ymyVar.h));
                return ffcu.a;
            }
        }, null, 0, 198);
        this.o = dnemVar;
        String string3 = context.getString(R.string.subject_urgent_dialog_title);
        string3.getClass();
        List b = ffdx.b(dnemVar);
        String string4 = context.getString(R.string.subject_urgent_dialog_dismiss);
        string4.getClass();
        doas doasVar = new doas(string4, new ffix() { // from class: ymg
            @Override // defpackage.ffix
            public final Object invoke() {
                ajiy ajiyVar = ymy.this.e;
                if (ajiyVar == null) {
                    ffkj.c("popupController");
                    ajiyVar = null;
                }
                ajiyVar.a();
                return ffcu.a;
            }
        });
        String string5 = context.getString(R.string.subject_urgent_dialog_confirm);
        string5.getClass();
        this.h = new dmvi(string3, b, null, null, new doas(string5, new ffix() { // from class: ymh
            @Override // defpackage.ffix
            public final Object invoke() {
                final ymy ymyVar = ymy.this;
                final String str = ymyVar.f;
                ajiy ajiyVar = null;
                if (str.length() == 0) {
                    str = null;
                }
                ymyVar.c.c(new ffji() { // from class: ymj
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        xhu xhuVar = (xhu) obj;
                        xhuVar.getClass();
                        return xhu.c(xhuVar, null, null, str, ymyVar.g, null, null, false, 0, 1011);
                    }
                });
                ajiy ajiyVar2 = ymyVar.e;
                if (ajiyVar2 == null) {
                    ffkj.c("popupController");
                } else {
                    ajiyVar = ajiyVar2;
                }
                ajiyVar.a();
                return ffcu.a;
            }
        }), doasVar, new ffix() { // from class: ymi
            @Override // defpackage.ffix
            public final Object invoke() {
                ajiy ajiyVar = ymy.this.e;
                if (ajiyVar == null) {
                    ffkj.c("popupController");
                    ajiyVar = null;
                }
                ajiyVar.a();
                return ffcu.a;
            }
        }, 12);
    }

    @Override // defpackage.ybu
    public final void a() {
        this.d.f(false);
    }

    @Override // defpackage.ymb
    public final fgdj b() {
        return this.m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r9 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r9 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dmpf c(java.lang.String r9, boolean r10) {
        /*
            r8 = this;
            xez r0 = r8.k
            dmpf r1 = new dmpf
            boolean r0 = r0.a()
            java.lang.String r2 = ""
            if (r0 == 0) goto L45
            if (r10 == 0) goto L42
            if (r9 == 0) goto L35
            int r0 = r9.length()
            if (r0 != 0) goto L17
            goto L35
        L17:
            android.content.Context r0 = r8.i
            r2 = 2132087808(0x7f151400, float:1.9815882E38)
            java.lang.String r0 = r0.getString(r2)
            r0.getClass()
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r9
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r3, r2)
            java.lang.String r9 = java.lang.String.format(r0, r9)
            r9.getClass()
            goto L48
        L35:
            android.content.Context r9 = r8.i
            r0 = 2132087810(0x7f151402, float:1.9815886E38)
            java.lang.String r9 = r9.getString(r0)
            r9.getClass()
            goto L48
        L42:
            if (r9 != 0) goto L48
            goto L49
        L45:
            if (r9 != 0) goto L48
            goto L49
        L48:
            r2 = r9
        L49:
            ymk r4 = new ymk
            r4.<init>(r8)
            yml r5 = new yml
            r5.<init>(r8)
            ymm r6 = new ymm
            r6.<init>(r8)
            ymn r7 = new ymn
            r7.<init>(r8)
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ymy.c(java.lang.String, boolean):dmpf");
    }

    public final dmvi d(dmvi dmviVar) {
        return dmvi.b(dmviVar, null, ffdx.g(dnmk.a(this.n, this.f, null, null, 61), dnem.a(this.o, null, null, null, this.g, null, null, 247)), null, null, null, null, 125);
    }

    @Override // defpackage.xil
    public final void fw() {
        if (!this.k.a()) {
            ensk f = a.f();
            f.Y(ente.a, "BugleComposeRow2");
            ((enrr) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/subjecturgent/SubjectUrgentUiAdapterImpl", "show", 137, "SubjectUrgentUiAdapterImpl.kt")).q("Showing subject/urgent row");
            this.d.f(true);
            return;
        }
        ensk f2 = a.f();
        f2.Y(ente.a, "BugleComposeRow2");
        ((enrr) f2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/subjecturgent/SubjectUrgentUiAdapterImpl", "show", 129, "SubjectUrgentUiAdapterImpl.kt")).q("Showing subject/urgent dialog");
        String str = ((xhu) this.c.a.c()).c;
        if (str == null) {
            str = "";
        }
        this.f = str;
        this.g = ((xhu) this.c.a.c()).d;
        this.j.d(true, new ffji() { // from class: ymc
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ajiy ajiyVar = (ajiy) obj;
                ajiyVar.getClass();
                ymy ymyVar = ymy.this;
                ymyVar.e = ajiyVar;
                return ymyVar.d(ymyVar.h);
            }
        });
    }
}
