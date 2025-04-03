package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.io.File;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcdc extends dcad {
    public static final dcle a;
    private static final eptv s;
    public final cskc b;
    public final Context c;
    public final alcb d;
    public final bcvn m;
    public final csuk n;
    public final bcpw o;
    public final altk p;
    public final bdvi q;
    public final errl r;
    private final dbxy t;
    private final alct u;
    private final akzt v;
    private final cqoh w;
    private final csum x;
    private final cxqk y;

    static {
        eptq eptqVar = (eptq) eptv.a.createBuilder();
        epts eptsVar = epts.FILE;
        eptqVar.copyOnWrite();
        eptv eptvVar = (eptv) eptqVar.instance;
        eptvVar.c = eptsVar.v;
        eptvVar.b |= 1;
        eptu eptuVar = eptu.EXPANDED;
        eptqVar.copyOnWrite();
        eptv eptvVar2 = (eptv) eptqVar.instance;
        eptvVar2.d = eptuVar.e;
        eptvVar2.b |= 2;
        eptv eptvVar3 = (eptv) eptqVar.build();
        s = eptvVar3;
        dcle dcleVar = dcle.a;
        int i = dclf.b;
        a = new dclg(eptvVar3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dcdc(defpackage.alct r4, defpackage.alcb r5, defpackage.akzt r6, defpackage.cqoh r7, defpackage.csuk r8, defpackage.csum r9, defpackage.errl r10, defpackage.altk r11, defpackage.cxqk r12, defpackage.bdvi r13, defpackage.dcbc r14) {
        /*
            r3 = this;
            eymn r0 = defpackage.eymn.FILE
            dcav r14 = (defpackage.dcav) r14
            com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView r1 = r14.i
            int r2 = r14.h
            r3.<init>(r0, r1, r2)
            java.lang.String r0 = "Bugle"
            java.lang.String r1 = "FileContentCategory"
            cskc r0 = defpackage.cskc.g(r0, r1)
            r3.b = r0
            r3.q = r13
            ea r13 = r14.a
            android.content.Context r13 = r13.z()
            r3.c = r13
            dbxy r13 = r14.d
            r3.t = r13
            r3.u = r4
            r3.d = r5
            r3.v = r6
            r3.w = r7
            czgy r4 = r14.g
            r3.m = r4
            bcpw r4 = r14.e
            r3.o = r4
            r3.n = r8
            r3.x = r9
            r3.r = r10
            r3.p = r11
            r3.y = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcdc.<init>(alct, alcb, akzt, cqoh, csuk, csum, errl, altk, cxqk, bdvi, dcbc):void");
    }

    @Override // defpackage.dcae
    public final int a() {
        return R.dimen.c2o_file_item_height;
    }

    @Override // defpackage.dcae
    public final int b() {
        return R.string.c2o_category_file_view_description;
    }

    @Override // defpackage.dcae
    protected final int c() {
        return R.drawable.quantum_ic_attachment_white_24;
    }

    @Override // defpackage.dcae
    public final Set d() {
        return new enpx(1401);
    }

    @Override // defpackage.dcae
    public final void f(cxqz cxqzVar) {
        int i = cxqzVar.a;
        if (i != 1401) {
            csjy.g("Bugle", "Wrong request code %d received ", Integer.valueOf(i));
            return;
        }
        Intent intent = cxqzVar.c;
        if (intent == null) {
            this.p.y();
            z();
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            csjy.f("Bugle", "Source uri is null from file picker");
            z();
            return;
        }
        String path = data.getPath();
        if (path != null && csuu.v(data) && this.x.e(new File(path))) {
            this.v.c("Bugle.Share.InternalDataFile.AttachAborted");
        } else if (csuu.z(data)) {
            this.v.c("Bugle.Share.InternalTelephonyMmsFile.AttachAborted");
        } else {
            new dcdb(this, data, cxqzVar).e(new Void[0]);
        }
    }

    @Override // defpackage.dcad, defpackage.dcae
    public final void gB(View view) {
        super.gB(view);
        View inflate = LayoutInflater.from(view.getContext()).inflate(R.layout.compose2o_file_view, (ViewGroup) this.e, false);
        inflate.setOnClickListener(this.y.a(new View.OnClickListener() { // from class: dcda
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dcdc.this.l(eptm.EXPAND);
            }
        }));
        inflate.setAccessibilityDelegate(this.f);
        this.e.removeAllViews();
        this.e.addView(inflate);
    }

    @Override // defpackage.dcat
    public final void j() {
        l(eptm.CATEGORY_HEADER);
    }

    public final int k() {
        bcpw bcpwVar = this.o;
        if (bcpwVar == null) {
            return 0;
        }
        bcpwVar.a();
        return ((bcvr) this.o.a()).k();
    }

    public final void l(eptm eptmVar) {
        this.w.f().toEpochMilli();
        dbxp dbxpVar = (dbxp) this.t;
        dbxpVar.x.c("Bugle.Share.FileAttachmentPicker.Entered");
        dbxpVar.q(epts.FILE, eptmVar);
        dbxpVar.B.B(dbxpVar.w, eptmVar);
    }

    @Override // defpackage.dcae
    public final boolean m() {
        return true;
    }

    public final boolean y() {
        return this.m.fu();
    }

    public final void z() {
        cqoh cqohVar = this.w;
        eptv eptvVar = s;
        cqohVar.f().toEpochMilli();
        this.u.c(eptvVar, eptk.UNKNOWN_CLOSING_SOURCE);
    }
}
