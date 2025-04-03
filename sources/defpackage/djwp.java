package defpackage;

import android.os.Message;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djwp extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djwp(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "RequestWithImsiState";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:61|(1:63)(1:151)|64|(1:66)|67|68|(2:69|70)|(14:72|73|74|75|76|77|78|79|80|81|82|(4:84|85|86|87)(1:132)|88|(3:90|(1:92)|(2:94|(2:96|97)(2:98|99))(2:100|(2:116|117)(3:104|(2:114|115)|107)))(2:118|119))|145|144|76|77|78|79|80|81|82|(0)(0)|88|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x020e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0213, code lost:
    
        android.util.Log.w("InstanceID", "Never happens: can't find own package ".concat(r0.toString()));
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0210, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0211, code lost:
    
        r18 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0325 A[Catch: IOException -> 0x0348, TryCatch #3 {IOException -> 0x0348, blocks: (B:81:0x0207, B:82:0x0221, B:84:0x023b, B:86:0x024d, B:90:0x028e, B:92:0x0296, B:94:0x029e, B:96:0x02a6, B:97:0x02ab, B:98:0x02ac, B:99:0x02c3, B:100:0x02c4, B:102:0x02cc, B:104:0x02d4, B:107:0x02f1, B:108:0x0331, B:112:0x02db, B:114:0x02ff, B:115:0x0311, B:116:0x0312, B:117:0x0324, B:118:0x0325, B:119:0x032a, B:123:0x0259, B:125:0x025f, B:126:0x026c, B:128:0x0274, B:130:0x027f, B:132:0x0286, B:135:0x0213, B:154:0x033a, B:155:0x0347), top: B:46:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0286 A[Catch: IOException -> 0x0348, TRY_LEAVE, TryCatch #3 {IOException -> 0x0348, blocks: (B:81:0x0207, B:82:0x0221, B:84:0x023b, B:86:0x024d, B:90:0x028e, B:92:0x0296, B:94:0x029e, B:96:0x02a6, B:97:0x02ab, B:98:0x02ac, B:99:0x02c3, B:100:0x02c4, B:102:0x02cc, B:104:0x02d4, B:107:0x02f1, B:108:0x0331, B:112:0x02db, B:114:0x02ff, B:115:0x0311, B:116:0x0312, B:117:0x0324, B:118:0x0325, B:119:0x032a, B:123:0x0259, B:125:0x025f, B:126:0x026c, B:128:0x0274, B:130:0x027f, B:132:0x0286, B:135:0x0213, B:154:0x033a, B:155:0x0347), top: B:46:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0367 A[Catch: MalformedURLException -> 0x03ed, TryCatch #8 {MalformedURLException -> 0x03ed, blocks: (B:25:0x00a3, B:28:0x00db, B:30:0x00e1, B:33:0x0361, B:35:0x0367, B:36:0x0369, B:38:0x03a9, B:40:0x03d6, B:41:0x03e1, B:142:0x0351, B:159:0x00f3, B:161:0x0107), top: B:24:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03a9 A[Catch: MalformedURLException -> 0x03ed, TryCatch #8 {MalformedURLException -> 0x03ed, blocks: (B:25:0x00a3, B:28:0x00db, B:30:0x00e1, B:33:0x0361, B:35:0x0367, B:36:0x0369, B:38:0x03a9, B:40:0x03d6, B:41:0x03e1, B:142:0x0351, B:159:0x00f3, B:161:0x0107), top: B:24:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0167 A[Catch: IOException -> 0x034a, TryCatch #2 {IOException -> 0x034a, blocks: (B:45:0x011c, B:48:0x012a, B:50:0x0135, B:53:0x013e, B:56:0x014b, B:59:0x0158, B:61:0x0167, B:64:0x0186, B:66:0x018e, B:67:0x01a2, B:151:0x0184), top: B:44:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023b A[Catch: IOException -> 0x0348, TRY_LEAVE, TryCatch #3 {IOException -> 0x0348, blocks: (B:81:0x0207, B:82:0x0221, B:84:0x023b, B:86:0x024d, B:90:0x028e, B:92:0x0296, B:94:0x029e, B:96:0x02a6, B:97:0x02ab, B:98:0x02ac, B:99:0x02c3, B:100:0x02c4, B:102:0x02cc, B:104:0x02d4, B:107:0x02f1, B:108:0x0331, B:112:0x02db, B:114:0x02ff, B:115:0x0311, B:116:0x0312, B:117:0x0324, B:118:0x0325, B:119:0x032a, B:123:0x0259, B:125:0x025f, B:126:0x026c, B:128:0x0274, B:130:0x027f, B:132:0x0286, B:135:0x0213, B:154:0x033a, B:155:0x0347), top: B:46:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028e A[Catch: IOException -> 0x0348, TRY_ENTER, TryCatch #3 {IOException -> 0x0348, blocks: (B:81:0x0207, B:82:0x0221, B:84:0x023b, B:86:0x024d, B:90:0x028e, B:92:0x0296, B:94:0x029e, B:96:0x02a6, B:97:0x02ab, B:98:0x02ac, B:99:0x02c3, B:100:0x02c4, B:102:0x02cc, B:104:0x02d4, B:107:0x02f1, B:108:0x0331, B:112:0x02db, B:114:0x02ff, B:115:0x0311, B:116:0x0312, B:117:0x0324, B:118:0x0325, B:119:0x032a, B:123:0x0259, B:125:0x025f, B:126:0x026c, B:128:0x0274, B:130:0x027f, B:132:0x0286, B:135:0x0213, B:154:0x033a, B:155:0x0347), top: B:46:0x0128 }] */
    @Override // defpackage.djxb, defpackage.dixy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djwp.b():void");
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_REQUEST_WITH_IMSI;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE;
    }

    @Override // defpackage.djxb
    public final boolean h() {
        return true;
    }

    @Override // defpackage.djxb
    public final boolean i() {
        return false;
    }

    @Override // defpackage.djxb
    public final boolean j() {
        return true;
    }

    @Override // defpackage.djyw
    public final boolean k(Message message, djta djtaVar) {
        this.a.D("RequestWithImsiState", message);
        int ordinal = djxs.ak(message).ordinal();
        if (ordinal == 4) {
            this.a.av(message.arg1);
            return false;
        }
        if (ordinal == 7) {
            dkdw dkdwVar = (dkdw) this.a.M.b();
            djxs djxsVar = this.a;
            dkdwVar.x(djxsVar.h, djxs.o(message));
            this.a.x(djxs.ak(message), message.arg1, message.arg2, message.obj);
            dksy.i(this.a.m);
            return true;
        }
        if (ordinal == 22) {
            this.a.ar(34);
            return false;
        }
        if (ordinal == 24) {
            this.a.ar(32);
            return false;
        }
        InputStream inputStream = null;
        if (ordinal == 46) {
            djxs djxsVar2 = this.a;
            djxsVar2.p.a((HttpURLConnection) message.obj, null, "RequestWithImsiState");
            this.a.au(ezez.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE, 401);
            if (!djai.Z()) {
                return false;
            }
            this.a.u.p(null);
            djxs djxsVar3 = this.a;
            djxsVar3.R(djxsVar3.al);
            return true;
        }
        if (ordinal != 41) {
            if (ordinal != 42) {
                return super.o(message, djtaVar);
            }
            this.a.z.d("Request with IMSI failed: IMSI lookup or header enrichment not successful", new Object[0]);
            if (this.a.ac()) {
                djxs djxsVar4 = this.a;
                djxsVar4.R(djxsVar4.at);
            } else {
                this.a.au(ezez.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE, 403);
                djxs djxsVar5 = this.a;
                djxsVar5.R(djxsVar5.al);
            }
            djxs djxsVar6 = this.a;
            djxsVar6.p.a((HttpURLConnection) message.obj, null, "RequestWithImsiState");
            return true;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) message.obj;
        int i = message.arg2;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    djxs djxsVar7 = this.a;
                    djxsVar7.p.d(djxsVar7.h, httpURLConnection);
                    try {
                        this.a.w(djta.MSG_CONFIG_DOC, this.a.y.a(inputStream));
                        djxs djxsVar8 = this.a;
                        djxsVar8.R(djxsVar8.aw);
                    } catch (IOException | IllegalArgumentException unused) {
                        djxs djxsVar9 = this.a;
                        djxsVar9.R(djxsVar9.an);
                    }
                } catch (dkbs e) {
                    e = e;
                    this.a.an(djta.MSG_EXCEPTION_CAUGHT, i);
                    this.a.aq(ezez.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE, 4);
                    this.a.z.f(e, "Failed to parse configuration.", new Object[0]);
                    this.a.E(ezez.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE);
                    return true;
                }
            } finally {
                this.a.p.a(httpURLConnection, inputStream, "RequestWithImsiState");
            }
        } catch (IOException e2) {
            e = e2;
            this.a.an(djta.MSG_EXCEPTION_CAUGHT, i);
            this.a.aq(ezez.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE, 4);
            this.a.z.f(e, "Failed to parse configuration.", new Object[0]);
            this.a.E(ezez.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE);
            return true;
        }
        return true;
    }
}
