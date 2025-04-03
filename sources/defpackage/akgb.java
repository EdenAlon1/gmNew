package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.cloudstore.accounts.FiAccountActivity;
import com.google.android.apps.messaging.ui.appsettings.RichCardsSettingsActivity;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.libraries.user.profile.photopicker.fragment.devicephotos.DevicePhotosFragment;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akgb extends akfe {
    final fbbf A;
    public final fbbf B;
    final fbbf C;
    public final fbbf D;
    final fbbf E;
    final fbbf F;
    public final fbbf G;
    public final fbbf H;
    public final fbbf I;
    final fbbf J;
    public final fbbf K;
    final fbbf L;
    public final fbbf M;
    public final fbbf N;
    final fbbf O;
    public final fbbf P;
    public final fbbf Q;
    public final fbbf R;
    public final fbbf S;
    final fbbf T;
    public final fbbf U;
    public final fbbf V;
    public final fbbf W;
    public final fbbf X;
    public final fbbf Y;
    public final fbbf Z;
    public final Activity a;
    final fbbf aA;
    public final fbbf aB;
    final fbbf aC;
    public final fbbf aD;
    public final fbbf aE;
    final fbbf aF;
    public final fbbf aG;
    public final fbbf aH;
    final fbbf aI;
    final fbbf aJ;
    public final fbbf aK;
    public final fbbf aL;
    public final fbbf aM;
    final fbbf aN;
    public final fbbf aO;
    public final fbbf aP;
    public final fbbf aQ;
    final fbbf aR;
    final fbbf aS;
    final fbbf aT;
    final fbbf aU;
    public final fbbf aV;
    final fbbf aW;
    public final fbbf aX;
    final fbbf aY;
    public final fbbf aZ;
    public final fbbf aa;
    public final fbbf ab;
    public final fbbf ac;
    public final fbbf ad;
    final fbbf ae;
    public final fbbf af;
    final fbbf ag;
    final fbbf ah;
    final fbbf ai;
    final fbbf aj;
    final fbbf ak;
    final fbbf al;
    final fbbf am;
    public final fbbf an;
    public final fbbf ao;
    final fbbf ap;
    final fbbf aq;
    final fbbf ar;
    public final fbbf as;
    final fbbf at;
    public final fbbf au;
    final fbbf av;
    final fbbf aw;
    final fbbf ax;
    public final fbbf ay;
    public final fbbf az;
    public final akis b;
    final fbbf bA;
    public final fbbf bB;
    public final fbbf bC;
    public final fbbf bD;
    final fbbf bE;
    public final fbbf bF;
    final fbbf bG;
    public final fbbf bH;
    final fbbf bI;
    final fbbf bJ;
    final fbbf bK;
    final fbbf bL;
    final fbbf bM;
    final fbbf bN;
    final fbbf bO;
    final fbbf bP;
    public final fbbf bQ;
    final fbbf bR;
    public final fbbf bS;
    final fbbf bT;
    public final fbbf bU;
    public final fbbf bV;
    public final fbbf bW;
    final fbbf bX;
    final fbbf bY;
    final fbbf bZ;
    public final fbbf ba;
    public final fbbf bb;
    final fbbf bc;
    final fbbf bd;
    final fbbf be;
    final fbbf bf;
    public final fbbf bg;
    public final fbbf bh;
    public final fbbf bi;
    final fbbf bj;
    public final fbbf bk;
    public final fbbf bl;
    public final fbbf bm;
    final fbbf bn;
    public final fbbf bo;
    public final fbbf bp;
    public final fbbf bq;
    final fbbf br;
    final fbbf bs;
    public final fbbf bt;
    final fbbf bu;
    final fbbf bv;
    final fbbf bw;
    public final fbbf bx;
    final fbbf by;
    final fbbf bz;
    public final akgg c;
    public final fbbf cA;
    final fbbf cB;
    public final fbbf cC;
    final fbbf cD;
    final fbbf cE;
    final fbbf cF;
    final fbbf cG;
    public final fbbf cH;
    public final fbbf cI;
    public final fbbf cJ;
    final fbbf cK;
    final fbbf cL;
    final fbbf cM;
    public final fbbf cN;
    final fbbf cO;
    public final fbbf cP;
    final fbbf cQ;
    public final fbbf cR;
    final fbbf cS;
    final fbbf cT;
    final fbbf cU;
    final fbbf cV;
    public final fbbf cW;
    public final fbbf cX;
    final fbbf cY;
    final fbbf cZ;
    final fbbf ca;
    final fbbf cb;
    final fbbf cc;
    final fbbf cd;
    final fbbf ce;
    final fbbf cf;
    final fbbf cg;
    final fbbf ch;
    public final fbbf ci;
    final fbbf cj;
    public final fbbf ck;
    public final fbbf cl;
    public final fbbf cm;
    final fbbf cn;
    final fbbf co;
    final fbbf cp;
    public final fbbf cq;
    public final fbbf cr;
    public final fbbf cs;
    final fbbf ct;
    final fbbf cu;
    final fbbf cv;
    final fbbf cw;
    final fbbf cx;
    final fbbf cy;
    final fbbf cz;
    public final fbbf d;
    final fbbf da;
    final fbbf db;
    final fbbf dc;
    final fbbf dd;
    final fbbf de;
    final fbbf df;
    final fbbf dg;
    final fbbf dh;
    final fbbf di;
    final fbbf dj;
    final fbbf dk;
    final fbbf dl;
    final fbbf dm;
    public final fbbf e;
    public final fbbf f;
    public final fbbf g;
    public final fbbf h;
    final fbbf i;
    public final fbbf j;
    public final fbbf k;
    public final fbbf l;
    public final fbbf m;
    final fbbf n;
    public final fbbf o;
    final fbbf p;
    final fbbf r;
    final fbbf s;
    final fbbf t;
    public final fbbf u;
    final fbbf v;
    public final fbbf w;
    public final fbbf x;
    public final fbbf y;
    final fbbf z;
    private final akgb dn = this;
    final fbbf q = akmf.a;

    public akgb(akis akisVar, akgg akggVar, Activity activity) {
        this.b = akisVar;
        this.c = akggVar;
        this.a = activity;
        this.d = new akga(akisVar, akggVar, this, 0);
        this.e = new akga(akisVar, akggVar, this, 1);
        this.f = fbbi.a(new akga(akisVar, akggVar, this, 3));
        this.g = fbaz.c(new akga(akisVar, akggVar, this, 2));
        this.h = new akga(akisVar, akggVar, this, 4);
        this.i = new akga(akisVar, akggVar, this, 6);
        this.j = new akga(akisVar, akggVar, this, 5);
        this.k = fbaz.c(new akga(akisVar, akggVar, this, 7));
        this.l = new akga(akisVar, akggVar, this, 8);
        this.m = fbaz.c(new akga(akisVar, akggVar, this, 9));
        this.n = fbbi.a(new akga(akisVar, akggVar, this, 12));
        this.o = fbaz.c(new akga(akisVar, akggVar, this, 14));
        this.p = fbaz.c(new akga(akisVar, akggVar, this, 15));
        this.r = new akga(akisVar, akggVar, this, 17);
        this.s = fbaz.c(new akga(akisVar, akggVar, this, 16));
        fbaz.c(new akga(akisVar, akggVar, this, 13));
        this.t = fbaz.c(new akga(akisVar, akggVar, this, 18));
        this.u = fbaz.c(new akga(akisVar, akggVar, this, 19));
        fbaz.c(new akga(akisVar, akggVar, this, 11));
        this.v = fbaz.c(new akga(akisVar, akggVar, this, 20));
        this.w = new akga(akisVar, akggVar, this, 10);
        this.x = fbaz.c(new akga(akisVar, akggVar, this, 21));
        this.y = fbaz.c(new akga(akisVar, akggVar, this, 23));
        this.z = fbaz.c(new akga(akisVar, akggVar, this, 22));
        this.A = fbaz.c(new akga(akisVar, akggVar, this, 24));
        this.B = fbaz.c(new akga(akisVar, akggVar, this, 25));
        this.C = new akga(akisVar, akggVar, this, 27);
        this.D = fbaz.c(new akga(akisVar, akggVar, this, 26));
        this.E = fbaz.c(new akga(akisVar, akggVar, this, 28));
        this.F = fbaz.c(new akga(akisVar, akggVar, this, 29));
        this.G = new akga(akisVar, akggVar, this, 30);
        this.H = new akga(akisVar, akggVar, this, 31);
        this.I = fbaz.c(new akga(akisVar, akggVar, this, 32));
        this.J = new akga(akisVar, akggVar, this, 34);
        this.K = new akga(akisVar, akggVar, this, 33);
        this.L = new akga(akisVar, akggVar, this, 36);
        this.M = new akga(akisVar, akggVar, this, 35);
        this.N = fbaz.c(new akga(akisVar, akggVar, this, 38));
        this.O = fbaz.c(new akga(akisVar, akggVar, this, 37));
        this.P = new akga(akisVar, akggVar, this, 39);
        this.Q = akmf.b;
        this.R = new akga(akisVar, akggVar, this, 40);
        this.S = akmf.b;
        this.T = new akga(akisVar, akggVar, this, 43);
        this.U = fbaz.c(new akga(akisVar, akggVar, this, 42));
        this.V = new akga(akisVar, akggVar, this, 41);
        this.W = new akga(akisVar, akggVar, this, 44);
        this.X = new akga(akisVar, akggVar, this, 45);
        this.Y = new akga(akisVar, akggVar, this, 46);
        this.Z = new akga(akisVar, akggVar, this, 47);
        this.aa = new akga(akisVar, akggVar, this, 48);
        this.ab = new akga(akisVar, akggVar, this, 49);
        this.ac = fbaz.c(new akga(akisVar, akggVar, this, 52));
        this.ad = new akga(akisVar, akggVar, this, 51);
        this.ae = fbaz.c(new akga(akisVar, akggVar, this, 53));
        this.af = new akga(akisVar, akggVar, this, 56);
        this.ag = akmf.b;
        this.ah = new akga(akisVar, akggVar, this, 59);
        this.ai = new akga(akisVar, akggVar, this, 58);
        this.aj = new akga(akisVar, akggVar, this, 60);
        this.ak = new akga(akisVar, akggVar, this, 61);
        this.al = new akga(akisVar, akggVar, this, 57);
        this.am = fbaz.c(new akga(akisVar, akggVar, this, 55));
        this.an = fbaz.c(new akga(akisVar, akggVar, this, 54));
        this.ao = fbaz.c(new akga(akisVar, akggVar, this, 62));
        this.ap = fbaz.c(new akga(akisVar, akggVar, this, 64));
        this.aq = fbaz.c(new akga(akisVar, akggVar, this, 63));
        this.ar = new akga(akisVar, akggVar, this, 66);
        this.as = new akga(akisVar, akggVar, this, 65);
        this.at = new akga(akisVar, akggVar, this, 68);
        this.au = new akga(akisVar, akggVar, this, 67);
        this.av = new akga(akisVar, akggVar, this, 70);
        this.aw = fbaz.c(new akga(akisVar, akggVar, this, 72));
        this.ax = new akga(akisVar, akggVar, this, 71);
        this.ay = new akga(akisVar, akggVar, this, 69);
        this.az = new akga(akisVar, akggVar, this, 73);
        this.aA = new akga(akisVar, akggVar, this, 75);
        this.aB = new akga(akisVar, akggVar, this, 74);
        this.aC = new akga(akisVar, akggVar, this, 77);
        this.aD = fbaz.c(new akga(akisVar, akggVar, this, 76));
        this.aE = new akga(akisVar, akggVar, this, 78);
        this.aF = new akga(akisVar, akggVar, this, 81);
        this.aG = new akga(akisVar, akggVar, this, 82);
        this.aH = new akga(akisVar, akggVar, this, 83);
        this.aI = new akga(akisVar, akggVar, this, 84);
        this.aJ = new akga(akisVar, akggVar, this, 80);
        this.aK = new akga(akisVar, akggVar, this, 79);
        this.aL = new akga(akisVar, akggVar, this, 85);
        this.aM = new akga(akisVar, akggVar, this, 86);
        this.aN = new akga(akisVar, akggVar, this, 88);
        this.aO = fbaz.c(new akga(akisVar, akggVar, this, 87));
        this.aP = akmf.b;
        this.aQ = new akga(akisVar, akggVar, this, 89);
        this.aR = fbaz.c(new akga(akisVar, akggVar, this, 90));
        this.aS = new akga(akisVar, akggVar, this, 92);
        this.aT = fbaz.c(new akga(akisVar, akggVar, this, 91));
        this.aU = fbaz.c(new akga(akisVar, akggVar, this, 93));
        this.aV = new akga(akisVar, akggVar, this, 94);
        this.aW = fbaz.c(new akga(akisVar, akggVar, this, 95));
        this.aX = new akga(akisVar, akggVar, this, 96);
        this.aY = fbaz.c(new akga(akisVar, akggVar, this, 97));
        this.aZ = new akga(akisVar, akggVar, this, 98);
        this.ba = new akga(akisVar, akggVar, this, 99);
        this.bb = new akga(akisVar, akggVar, this, 100);
        this.bc = new akga(akisVar, akggVar, this, 102);
        this.bd = fbaz.c(new akga(akisVar, akggVar, this, EnergyProfile.EVCONNECTOR_TYPE_OTHER));
        this.be = new akga(akisVar, akggVar, this, 104);
        this.bf = fbaz.c(new akga(akisVar, akggVar, this, 103));
        this.bg = new akga(akisVar, akggVar, this, 105);
        this.bh = new akga(akisVar, akggVar, this, 106);
        this.bi = new akga(akisVar, akggVar, this, 107);
        this.bj = fbaz.c(new akga(akisVar, akggVar, this, 108));
        this.bk = new akga(akisVar, akggVar, this, 109);
        this.bl = fbaz.c(new akga(akisVar, akggVar, this, 110));
        this.bm = fbbi.a(new akga(akisVar, akggVar, this, 111));
        this.bn = new akga(akisVar, akggVar, this, 113);
        this.bo = new akga(akisVar, akggVar, this, 112);
        this.bp = new akga(akisVar, akggVar, this, 114);
        this.bq = new akga(akisVar, akggVar, this, 117);
        this.br = new akga(akisVar, akggVar, this, 118);
        this.bs = new akga(akisVar, akggVar, this, 116);
        this.bt = fbaz.c(new akga(akisVar, akggVar, this, 115));
        this.bu = new akga(akisVar, akggVar, this, 120);
        this.bv = new akga(akisVar, akggVar, this, 121);
        this.bw = fbbi.a(new akga(akisVar, akggVar, this, 122));
        this.bx = fbaz.c(new akga(akisVar, akggVar, this, 119));
        this.by = new akga(akisVar, akggVar, this, 126);
        this.bz = new akga(akisVar, akggVar, this, 128);
        this.bA = new akga(akisVar, akggVar, this, 127);
        this.bB = fbaz.c(new akga(akisVar, akggVar, this, 131));
        this.bC = fbaz.c(new akga(akisVar, akggVar, this, 130));
        this.bD = fbaz.c(new akga(akisVar, akggVar, this, 132));
        this.bE = fbaz.c(new akga(akisVar, akggVar, this, 133));
        this.bF = fbaz.c(new akga(akisVar, akggVar, this, 129));
        this.bG = fbaz.c(new akga(akisVar, akggVar, this, 136));
        this.bH = fbaz.c(new akga(akisVar, akggVar, this, 137));
        this.bI = fbaz.c(new akga(akisVar, akggVar, this, 139));
        this.bJ = fbaz.c(new akga(akisVar, akggVar, this, 138));
        this.bK = fbaz.c(new akga(akisVar, akggVar, this, 135));
        this.bL = new akga(akisVar, akggVar, this, 134);
        this.bM = fbaz.c(new akga(akisVar, akggVar, this, 140));
        this.bN = fbaz.c(new akga(akisVar, akggVar, this, 141));
        this.bO = new akga(akisVar, akggVar, this, 142);
        this.bP = new akga(akisVar, akggVar, this, 143);
        this.bQ = fbaz.c(new akga(akisVar, akggVar, this, 125));
        this.bR = new akga(akisVar, akggVar, this, 124);
        this.bS = new akga(akisVar, akggVar, this, 145);
        this.bT = fbaz.c(new akga(akisVar, akggVar, this, 147));
        this.bU = fbaz.c(new akga(akisVar, akggVar, this, 146));
        this.bV = fbaz.c(new akga(akisVar, akggVar, this, 148));
        this.bW = fbaz.c(new akga(akisVar, akggVar, this, 149));
        this.bX = new akga(akisVar, akggVar, this, 144);
        this.bY = new akga(akisVar, akggVar, this, 150);
        this.bZ = new akga(akisVar, akggVar, this, 151);
        this.ca = new akga(akisVar, akggVar, this, 152);
        this.cb = new akga(akisVar, akggVar, this, 153);
        this.cc = new akga(akisVar, akggVar, this, 154);
        this.cd = new akga(akisVar, akggVar, this, 155);
        this.ce = new akga(akisVar, akggVar, this, 156);
        this.cf = new akga(akisVar, akggVar, this, 157);
        this.cg = fbaz.c(new akga(akisVar, akggVar, this, 160));
        this.ch = fbaz.c(new akga(akisVar, akggVar, this, 159));
        this.ci = new akga(akisVar, akggVar, this, 161);
        this.cj = new akga(akisVar, akggVar, this, 158);
        this.ck = fbaz.c(new akga(akisVar, akggVar, this, 163));
        fbay fbayVar = new fbay();
        this.cl = fbayVar;
        this.cm = new akga(akisVar, akggVar, this, 164);
        this.cn = new akga(akisVar, akggVar, this, 162);
        this.co = new akga(akisVar, akggVar, this, 165);
        this.cp = new akga(akisVar, akggVar, this, 166);
        fbay.a(fbayVar, new akga(akisVar, akggVar, this, 123));
        this.cq = fbaz.c(new akga(akisVar, akggVar, this, 167));
        this.cr = new akga(akisVar, akggVar, this, 170);
        this.cs = fbaz.c(new akga(akisVar, akggVar, this, 169));
        this.ct = fbaz.c(new akga(akisVar, akggVar, this, 171));
        this.cu = fbaz.c(new akga(akisVar, akggVar, this, 172));
        this.cv = fbaz.c(new akga(akisVar, akggVar, this, 173));
        this.cw = fbaz.c(new akga(akisVar, akggVar, this, 174));
        this.cx = new akga(akisVar, akggVar, this, 175);
        this.cy = new akga(akisVar, akggVar, this, 176);
        akga akgaVar = new akga(akisVar, akggVar, this, 168);
        this.cz = akgaVar;
        this.cA = fbaz.c(akgaVar);
        akga akgaVar2 = new akga(akisVar, akggVar, this, 177);
        this.cB = akgaVar2;
        this.cC = fbaz.c(akgaVar2);
        this.cD = new akga(akisVar, akggVar, this, 178);
        this.cE = new akga(akisVar, akggVar, this, 179);
        this.cF = new akga(akisVar, akggVar, this, 180);
        this.cG = fbaz.c(new akga(akisVar, akggVar, this, 181));
        this.cH = new akga(akisVar, akggVar, this, 182);
        this.cI = new akga(akisVar, akggVar, this, 183);
        this.cJ = new akga(akisVar, akggVar, this, 184);
        this.cK = fbbi.a(new akga(akisVar, akggVar, this, 186));
        fbaz.c(new akga(akisVar, akggVar, this, 185));
        this.cL = fbbi.a(new akga(akisVar, akggVar, this, 187));
        this.cM = new akga(akisVar, akggVar, this, 188);
        this.cN = new akga(akisVar, akggVar, this, 189);
        akga akgaVar3 = new akga(akisVar, akggVar, this, 190);
        this.cO = akgaVar3;
        this.cP = fbaz.c(akgaVar3);
        this.cQ = new akga(akisVar, akggVar, this, 192);
        this.cR = new akga(akisVar, akggVar, this, 191);
        this.cS = new akga(akisVar, akggVar, this, 193);
        this.cT = new akga(akisVar, akggVar, this, 194);
        akga akgaVar4 = new akga(akisVar, akggVar, this, 195);
        this.cU = akgaVar4;
        this.cV = fbaz.c(akgaVar4);
        this.cW = fbaz.c(new akga(akisVar, akggVar, this, 196));
        this.cX = new akga(akisVar, akggVar, this, 197);
        this.cY = new akga(akisVar, akggVar, this, BasePaymentResult.ERROR_REQUEST_FAILED);
        this.cZ = new akga(akisVar, akggVar, this, 199);
        this.da = new akga(akisVar, akggVar, this, BasePaymentResult.ERROR_REQUEST_TIMEOUT);
        this.db = new akga(akisVar, akggVar, this, BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED);
        this.dc = new akga(akisVar, akggVar, this, BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED);
        this.dd = fbaz.c(new akga(akisVar, akggVar, this, 204));
        this.de = new akga(akisVar, akggVar, this, 198);
        this.df = new akga(akisVar, akggVar, this, 205);
        this.dg = new akga(akisVar, akggVar, this, 207);
        this.dh = new akga(akisVar, akggVar, this, 206);
        this.di = new akga(akisVar, akggVar, this, 211);
        this.dj = new akga(akisVar, akggVar, this, 210);
        this.dk = new akga(akisVar, akggVar, this, 212);
        this.dl = new akga(akisVar, akggVar, this, 209);
        this.dm = new akga(akisVar, akggVar, this, 208);
    }

    final adni A() {
        Activity activity = (Activity) this.d.b();
        final ejar ejarVar = (ejar) this.b.a.au.b();
        final ffsk ffskVar = (ffsk) this.b.a.p.b();
        akko akkoVar = this.b.b;
        final fbbf fbbfVar = akkoVar.p;
        final fbbf fbbfVar2 = akkoVar.ob;
        final fbbf fbbfVar3 = akkoVar.u;
        activity.getClass();
        ejarVar.getClass();
        ffskVar.getClass();
        fbbfVar.getClass();
        fbbfVar2.getClass();
        fbbfVar3.getClass();
        adln adlnVar = new adln();
        ebsi k = ebsj.k();
        ((ebsb) k).b = emux.a;
        k.d(new ebst(activity.getString(R.string.app_name)));
        k.c(new ebsr());
        adlnVar.a = k.e();
        adlnVar.d(new adnk() { // from class: acnt
            @Override // defpackage.adnk
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                View inflate = layoutInflater.inflate(R.layout.gp_web_tablet_express_sign_in, viewGroup, false);
                inflate.getClass();
                return inflate;
            }

            @Override // defpackage.adnk
            public final /* synthetic */ void b() {
            }
        });
        adlnVar.c(new Function() { // from class: acnu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                elfl c;
                c = axol.c(ffsk.this, ffhe.a, ffsm.a, new acnx((eisx) obj, ejarVar, fbbfVar, fbbfVar2, null));
                axnw.h(c);
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        adlnVar.b(new Function() { // from class: acnv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                elfl c;
                c = axol.c(ffsk.this, ffhe.a, ffsm.a, new acny(fbbfVar3, fbbfVar, null));
                axnw.h(c);
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return adlnVar.a();
    }

    final adni B() {
        final Activity activity = (Activity) this.d.b();
        activity.getClass();
        ebsi k = ebsj.k();
        ebsb ebsbVar = (ebsb) k;
        ebsbVar.b = emux.a;
        k.d(new ebst(activity.getString(R.string.app_name)));
        ebsbVar.c = new ebss(R.style.EquallyWeightedButton);
        k.c(new ebsr());
        adln adlnVar = new adln();
        adlnVar.a = k.e();
        adlnVar.d(new adnk() { // from class: dbvk
            @Override // defpackage.adnk
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                View inflate = layoutInflater.inflate(R.layout.gpp_express_sign_in, viewGroup, false);
                inflate.getClass();
                return inflate;
            }

            @Override // defpackage.adnk
            public final /* synthetic */ void b() {
            }
        });
        adlnVar.c(new Function() { // from class: dbvl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eisx eisxVar = (eisx) obj;
                eisxVar.getClass();
                dbvn.a(activity, eisxVar, true);
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        adlnVar.b(new Function() { // from class: dbvm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eisx eisxVar = (eisx) obj;
                eisxVar.getClass();
                dbvn.a(activity, eisxVar, false);
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return adlnVar.a();
    }

    final adni C() {
        Activity activity = (Activity) this.d.b();
        activity.getClass();
        ebsi k = ebsj.k();
        ((ebsb) k).b = emux.a;
        k.d(new ebst(activity.getString(R.string.app_name)));
        k.c(new ebsr());
        adln adlnVar = new adln();
        adlnVar.a = k.e();
        adlnVar.d(new adnk() { // from class: adnl
            @Override // defpackage.adnk
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                View inflate = layoutInflater.inflate(R.layout.express_sign_in, viewGroup, false);
                inflate.getClass();
                return inflate;
            }

            @Override // defpackage.adnk
            public final /* synthetic */ void b() {
            }
        });
        return adlnVar.a();
    }

    final adni D() {
        final Activity activity = (Activity) this.d.b();
        activity.getClass();
        fbes a = cgjn.a(activity.getIntent());
        ertf ertfVar = null;
        if (a == null) {
            cgjn.a.m("chatIntentApiArgs is null.");
        } else {
            eyee eyeeVar = a.i;
            if (eyeeVar.H()) {
                cgjn.a.m("chatIntentApiArgs doesn't have conversationContext.");
            } else {
                try {
                    fbjq fbjqVar = (fbjq) eyfy.parseFrom(fbjq.a, eyeeVar, eyfc.a());
                    if ((fbjqVar.b & 2) != 0) {
                        ertf ertfVar2 = fbjqVar.c;
                        ertfVar = ertfVar2 == null ? ertf.a : ertfVar2;
                    } else {
                        cgjn.a.m("BusinessData doesn't exist");
                    }
                } catch (eygu e) {
                    cgjn.a.s("InvalidProtocolBufferException in getBusinessData.", e);
                }
            }
        }
        fbbf fbbfVar = this.U;
        akis akisVar = this.b;
        ebsi k = ebsj.k();
        ((ebsb) k).b = emux.a;
        ebsj e2 = k.e();
        adln adlnVar = new adln();
        adlnVar.a = e2;
        Object b = akisVar.a.Px.b();
        b.getClass();
        Object b2 = fbbfVar.b();
        b2.getClass();
        adlnVar.d(new cgkf((akvg) b, (ekmz) b2, ertfVar, new emwl() { // from class: cgkj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                activity.finish();
                return ffcu.a;
            }
        }));
        return adlnVar.a();
    }

    @Override // ellg.a
    public final ellq E() {
        return (ellq) this.b.b.oJ.b();
    }

    final adni F() {
        final Activity activity = (Activity) this.d.b();
        ejar ejarVar = (ejar) this.b.a.au.b();
        ffsk ffskVar = (ffsk) this.b.a.p.b();
        akis akisVar = this.b;
        akkp akkpVar = akisVar.a;
        fbbf fbbfVar = akisVar.b.nl;
        final ayfg ayfgVar = (ayfg) akkpVar.nW.b();
        final fbbf fbbfVar2 = this.b.b.ld;
        activity.getClass();
        ejarVar.getClass();
        ffskVar.getClass();
        fbbfVar.getClass();
        ayfgVar.getClass();
        fbbfVar2.getClass();
        adln adlnVar = new adln();
        ebsi k = ebsj.k();
        ((ebsb) k).b = emux.a;
        k.b(ebsn.a(activity, new Runnable() { // from class: ajfb
            @Override // java.lang.Runnable
            public final void run() {
                ayfg.this.j(activity, null);
            }
        }));
        k.c(new ebsr());
        adlnVar.a = k.e();
        adlnVar.d(new adnk() { // from class: ajfc
            @Override // defpackage.adnk
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                View inflate = layoutInflater.inflate(R.layout.penpal_express_sign_in, viewGroup, false);
                inflate.getClass();
                return inflate;
            }

            @Override // defpackage.adnk
            public final /* synthetic */ void b() {
            }
        });
        adlnVar.c(new Function() { // from class: ajfd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Log.d("PenpalOnboarding", "PenpalOptionsModule.getPenpalOptions - user clicks through sell page with sign in");
                ((ajfs) ffbr.this.b()).c();
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return adlnVar.a();
    }

    final adni G() {
        Activity activity = (Activity) this.d.b();
        fbbf fbbfVar = this.b.b.lp;
        activity.getClass();
        fbbfVar.getClass();
        akgg akggVar = this.c;
        return dems.b(activity, akggVar.bp, akggVar.bq, akggVar.br, false);
    }

    final adni H() {
        Activity activity = (Activity) this.d.b();
        fbbf fbbfVar = this.b.b.lp;
        activity.getClass();
        fbbfVar.getClass();
        akgg akggVar = this.c;
        return dems.b(activity, akggVar.bp, akggVar.bq, akggVar.br, true);
    }

    final adpm I() {
        return new adpm((Activity) this.d.b(), (elbx) this.b.aJ.b(), v(), (adpn) this.dd.b(), this.cZ);
    }

    final adsj J() {
        return new adsj(this.b.cX);
    }

    final adsm K() {
        return new adsm();
    }

    final adsp L() {
        return new adsp((adtc) this.c.bt.b(), (ddzb) this.b.a.nk.b());
    }

    final adsq M() {
        return new adsq((cvbr) this.b.a.fe.b());
    }

    final aehk N() {
        Context context = (Context) this.d.b();
        akis akisVar = this.b;
        fbbf fbbfVar = akisVar.gH;
        crjx crjxVar = (crjx) akisVar.a.r.b();
        akko akkoVar = this.b.b;
        auba aV = akkoVar.aV();
        atzl atzlVar = (atzl) akkoVar.jR.b();
        akis akisVar2 = this.b;
        fbbf fbbfVar2 = akisVar2.a.ao;
        akko akkoVar2 = akisVar2.b;
        return new aehk(context, fbbfVar, crjxVar, this.ag, this.ai, aV, atzlVar, fbbfVar2, akkoVar2.jS, akkoVar2.jT);
    }

    final aehl O() {
        Context context = (Context) this.d.b();
        fbbf fbbfVar = this.d;
        akis akisVar = this.b;
        akkp akkpVar = akisVar.a;
        return new aehl(context, new czyi(fbbfVar, akkpVar.xj, this.ak, this.aj, akkpVar.Df, akisVar.b.jV));
    }

    final aeik P() {
        akis akisVar = this.b;
        akkp akkpVar = akisVar.a;
        return new aeik(akisVar.cz, akkpVar.ej, this.af, akisVar.aJ, akisVar.p, akisVar.aK, this.al, akkpVar.f, akkpVar.C, akkpVar.ng, akisVar.cN, akisVar.b.oi);
    }

    final aejj Q() {
        return new aejj((Context) this.d.b(), this.b.b.jU);
    }

    final aejt R() {
        Context context = (Context) this.d.b();
        bcym bcymVar = (bcym) this.b.a.xj.b();
        cuxh cuxhVar = (cuxh) this.b.a.ae.b();
        akis akisVar = this.b;
        fbbf fbbfVar = akisVar.lz;
        akkp akkpVar = akisVar.a;
        fbbf fbbfVar2 = akisVar.cI;
        fbbf fbbfVar3 = akkpVar.C;
        fbbf fbbfVar4 = akisVar.kk;
        akko akkoVar = akisVar.b;
        return new aejt(context, bcymVar, cuxhVar, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, akkoVar.jU, akkoVar.jV, akkpVar.pU, akkoVar.jW);
    }

    final aeju S() {
        Context context = (Context) this.d.b();
        akis akisVar = this.b;
        fbbf fbbfVar = akisVar.a.r;
        akko akkoVar = akisVar.b;
        return new aeju(context, fbbfVar, akkoVar.jY, akkoVar.jZ, akkoVar.ka);
    }

    final aejv T() {
        return new aejv((Context) this.d.b(), fbaz.a(this.b.a.ap), this.b.b.jU);
    }

    final aejz U() {
        Context context = (Context) this.d.b();
        cqoh cqohVar = (cqoh) this.b.cz.b();
        csrh csrhVar = (csrh) this.b.a.xi.b();
        akko akkoVar = this.b.b;
        return new aejz(context, cqohVar, csrhVar, akkoVar.jU, akkoVar.jX);
    }

    final aeka V() {
        return new aeka((Context) this.d.b());
    }

    final aelz W() {
        akgg akggVar = this.c;
        return new aelz(bc(), enip.s(this.b.b.P(), new aelc((Context) akggVar.a.q.b(), fbaz.a(akggVar.bs)), this.b.b.O()));
    }

    final ajly X() {
        return new ajly((Activity) this.d.b(), (elbx) this.b.aJ.b(), v(), (ajlz) this.aW.b(), this.cZ);
    }

    @Override // defpackage.aktj
    public final aktl Y() {
        return (aktl) this.aw.b();
    }

    @Override // defpackage.ctup
    public final ctuo Z() {
        return (ctuo) this.g.b();
    }

    @Override // defpackage.tan
    public final tam a() {
        return (tam) this.m.b();
    }

    final egex aA() {
        return new egex((egcn) this.bL.b(), (errl) this.b.aK.b(), (ewjg) this.bM.b(), (egct) this.bA.b(), new eghe((Context) this.b.q.b(), (egaj) this.bU.b()), (dulp) this.b.cy.b(), (egjw) this.bV.b());
    }

    final egfd aB() {
        return new egfd((egcn) this.bL.b(), (errl) this.b.aK.b(), (ewjg) this.bM.b(), (egct) this.bA.b(), (egdu) this.by.b(), (ewiq) this.bN.b());
    }

    final egfr aC() {
        return new egfr((egcn) this.bL.b(), (errl) this.b.aK.b(), (ewjg) this.bM.b(), (egct) this.bA.b(), (egdu) this.by.b());
    }

    final egfx aD() {
        return new egfx((egcn) this.bL.b(), (errl) this.b.aK.b(), (ewjg) this.bM.b(), (egct) this.bA.b(), (egdu) this.by.b(), (ewiq) this.bN.b());
    }

    final eghq aE() {
        return ((egdr) this.bQ.b()).b();
    }

    public final eghu aF() {
        return ((egdr) this.bQ.b()).c();
    }

    public final eghy aG() {
        return ((egdr) this.bQ.b()).e();
    }

    public final egig aH() {
        return ((egdr) this.bQ.b()).f();
    }

    public final egqj aI() {
        fbbf fbbfVar = this.cD;
        egqe egqeVar = egqe.ART;
        fazb a = fbaz.a(fbbfVar);
        egqc i = egqf.i();
        i.e(egqe.ART);
        i.b(fdrj.c());
        i.d(egpx.START_IN_ART_TAB);
        i.c(a);
        i.f(R.string.op3_picker_art_header);
        i.g(122831);
        ((egpz) i).a = new egqd() { // from class: efuw
            @Override // defpackage.egqd
            public final void a(Context context, ehrt ehrtVar, ColorStateList colorStateList) {
                Drawable a2 = ku.a(context, R.drawable.quantum_gm_ic_color_lens_vd_theme_24);
                ehrtVar.e(a2);
                a2.setTintList(colorStateList);
            }
        };
        egqf a2 = i.a();
        fbbf fbbfVar2 = this.cE;
        egqe egqeVar2 = egqe.DEVICE_PHOTOS;
        final fazb a3 = fbaz.a(fbbfVar2);
        egqc i2 = egqf.i();
        i2.e(egqe.DEVICE_PHOTOS);
        i2.d(egpx.START_IN_DEVICE_PHOTOS_TAB);
        a3.getClass();
        i2.c(new fazb() { // from class: egqk
            @Override // defpackage.fazb
            public final Object b() {
                return (ea) fazb.this.b();
            }
        });
        i2.f(R.string.op3_picker_device_photos);
        i2.g(110516);
        egpz egpzVar = (egpz) i2;
        egpzVar.a = new egqd() { // from class: egql
            @Override // defpackage.egqd
            public final void a(Context context, ehrt ehrtVar, ColorStateList colorStateList) {
                Drawable a4 = ku.a(context, R.drawable.quantum_gm_ic_smartphone_vd_theme_24);
                ehrtVar.e(a4);
                a4.setTintList(colorStateList);
            }
        };
        egpzVar.b = emxc.j(new Runnable() { // from class: egqm
            @Override // java.lang.Runnable
            public final void run() {
                ((DevicePhotosFragment) fazb.this.b()).p();
            }
        });
        egqf a4 = i2.a();
        fbbf fbbfVar3 = this.bU;
        fbbf fbbfVar4 = this.cF;
        egqe egqeVar3 = egqe.GOOGLE_PHOTOS;
        fazb a5 = fbaz.a(fbbfVar4);
        boolean g = ((egrb) this.bB.b()).b.g();
        egqc i3 = egqf.i();
        i3.e(egqe.GOOGLE_PHOTOS);
        i3.b(g);
        i3.d(egpx.START_IN_GOOGLE_PHOTOS_TAB);
        i3.c(a5);
        i3.f(R.string.op3_picker_google_photos);
        i3.g(110515);
        ((egpz) i3).a = new egqd() { // from class: egqn
            @Override // defpackage.egqd
            public final void a(Context context, ehrt ehrtVar, ColorStateList colorStateList) {
                ehrtVar.e(ku.a(context, R.drawable.quantum_gm_ic_photos_vd_theme_24));
            }
        };
        return new egqj(enhk.n(egqeVar, a2, egqeVar2, a4, egqeVar3, i3.a()), emxc.j(enkr.c(egqe.MONOGRAM, egqe.ART, egqe.DEVICE_PHOTOS, egqe.GOOGLE_PHOTOS)));
    }

    final egre aJ() {
        return new egre((Activity) this.d.b(), new egjv((Activity) this.d.b()));
    }

    final eisx aK() {
        return eisx.b(aM().g());
    }

    @Override // defpackage.eitx
    public final eito aL() {
        return (eito) this.w.b();
    }

    public final eiwl aM() {
        eiwl eiwlVar = (eiwl) this.t.b();
        eiwlVar.getClass();
        return eiwlVar;
    }

    public final ejhf aN() {
        Activity activity = (Activity) this.d.b();
        Activity activity2 = (Activity) this.d.b();
        elbx elbxVar = (elbx) this.b.aJ.b();
        fbbf fbbfVar = this.de;
        fbbf fbbfVar2 = this.cZ;
        return activity instanceof FiAccountActivity ? new adia() : new adie(new adhy(activity2, elbxVar, fbbfVar, fbbfVar2), activity, fbbfVar2);
    }

    @Override // ekky.a
    public final ekjp aO() {
        return (ekjp) this.s.b();
    }

    @Override // defpackage.ekko
    public final eklg aP() {
        return (eklg) this.cG.b();
    }

    @Override // defpackage.crkk
    public final ekmz aQ() {
        return (ekmz) this.U.b();
    }

    public final elgu aR() {
        return new elgu((elbx) this.b.aJ.b());
    }

    final emxc aS() {
        return emxc.i(this.a);
    }

    final emxc aT() {
        Activity activity = this.a;
        try {
            return activity == null ? emux.a : emxc.j((eg) activity);
        } catch (ClassCastException e) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(String.valueOf(String.valueOf(activity))), e);
        }
    }

    final emxc aU() {
        return ((egdr) this.bQ.b()).k();
    }

    @Override // ekky.e
    public final emxc aV() {
        return (emxc) this.r.b();
    }

    final exel aW() {
        exgs exgsVar = (exgs) this.bD.b();
        exfi exfiVar = (exfi) this.bE.b();
        exek exekVar = (exek) exel.a.createBuilder();
        exekVar.copyOnWrite();
        exel exelVar = (exel) exekVar.instance;
        exelVar.c = 5;
        exelVar.b |= 1;
        exekVar.copyOnWrite();
        exel exelVar2 = (exel) exekVar.instance;
        exgsVar.getClass();
        exelVar2.d = exgsVar;
        exelVar2.b |= 2;
        exekVar.copyOnWrite();
        exel exelVar3 = (exel) exekVar.instance;
        exfiVar.getClass();
        exelVar3.e = exfiVar;
        exelVar3.b |= 4;
        exel exelVar4 = (exel) exekVar.build();
        exelVar4.getClass();
        return exelVar4;
    }

    @Override // fazp.a
    public final fazq aX() {
        enhd h = enhk.h(17);
        h.k("eiue$a", true);
        h.k("svj", true);
        h.k("dptq", true);
        h.k("tzj", true);
        h.k("wge", true);
        h.k("aenx", true);
        h.k("eixb", true);
        h.k("dbjv", true);
        h.k("emge", true);
        h.k("ejmb", true);
        h.k("ahmi", true);
        h.k("wok", true);
        h.k("ahqx", true);
        h.k("depk", true);
        h.k("egub", true);
        h.k("ejwn", true);
        h.k("cxln", true);
        return new fazq(new fbbc(h.c()), new aklr(this.b, this.c));
    }

    final Object aY() {
        return new adsl(this.H, this.b.a.fo);
    }

    final Object aZ() {
        emxc aT = aT();
        ekki ekkiVar = (ekki) this.n.b();
        return aT.g() ? new eitu((eg) aT.c(), ekkiVar) : new eitt(ekkiVar);
    }

    @Override // defpackage.cvnj
    public final cvom aa() {
        return (cvom) this.aY.b();
    }

    public final RichCardsSettingsActivity ab() {
        Activity activity = (Activity) this.d.b();
        if (!(activity instanceof RichCardsSettingsActivity)) {
            throw new IllegalStateException(a.I(activity, cxcz.class, "Attempt to inject a Activity wrapper of type "));
        }
        RichCardsSettingsActivity richCardsSettingsActivity = (RichCardsSettingsActivity) activity;
        richCardsSettingsActivity.getClass();
        return richCardsSettingsActivity;
    }

    @Override // defpackage.cyal
    public final cxzh ac() {
        return (cxzh) this.y.b();
    }

    @Override // defpackage.cynf
    public final cynd ad() {
        return (cynd) this.bd.b();
    }

    @Override // defpackage.cyng
    public final cyne ae() {
        return (cyne) this.bf.b();
    }

    @Override // defpackage.czqc
    public final czqb af() {
        return (czqb) this.bj.b();
    }

    final ddpt ag() {
        return new ddpt(W());
    }

    final ddqa ah() {
        akis akisVar = this.b;
        akkp akkpVar = akisVar.a;
        return new ddqa(akisVar.cz, akkpVar.rn, akisVar.t, akkpVar.sr, this.bq, akisVar.fM, akkpVar.ii, akisVar.b.oA);
    }

    final ddqe ai() {
        akis akisVar = this.b;
        fbbf fbbfVar = akisVar.q;
        akkp akkpVar = akisVar.a;
        return new ddqe(fbbfVar, akkpVar.rj, akisVar.p, akisVar.t, this.bq, akkpVar.rn, akisVar.fM, akisVar.cz, akisVar.kh, akkpVar.pD);
    }

    @Override // defpackage.ddqf
    public final ddqu aj() {
        return (ddqu) this.bt.b();
    }

    @Override // defpackage.ddwo
    public final ddwp ak() {
        return (ddwp) this.k.b();
    }

    @Override // defpackage.dqlr
    public final dqlp al() {
        return (dqlp) this.bl.b();
    }

    final drst am() {
        return new drst(this.b.a.md());
    }

    @Override // defpackage.dsmq
    public final dsml an() {
        return (dsml) this.bx.b();
    }

    final dsmr ao() {
        Activity activity = (Activity) this.d.b();
        activity.getClass();
        int i = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512;
        if (Build.VERSION.SDK_INT < 30 || i <= 0) {
            Object b = this.bv.b();
            b.getClass();
            return (dsmr) b;
        }
        Object b2 = this.bu.b();
        b2.getClass();
        return (dsmr) b2;
    }

    final dsob ap() {
        return new dsob(this.d, this.b.ll);
    }

    final dsol aq() {
        return new dsol((Activity) this.d.b(), (dlpw) this.b.l.b(), (effy) this.bw.b(), (ffsk) this.b.a.q.b(), (dqkk) this.b.ll.b());
    }

    public final dvxb ar() {
        exel aW = aW();
        eyfw eyfwVar = egdl.a;
        exet exetVar = (exet) exeu.a.createBuilder();
        exetVar.copyOnWrite();
        exeu exeuVar = (exeu) exetVar.instance;
        exeuVar.d = aW;
        exeuVar.c |= 1;
        return new dvxb(eyfwVar, (exeu) exetVar.build());
    }

    public final dvxc as() {
        emxc emxcVar = (emxc) this.bC.b();
        return !emxcVar.g() ? dvyd.b() : dvyd.a((String) emxcVar.c());
    }

    public final efux at() {
        eg egVar = (eg) this.f.b();
        return new efux(egVar, this.cS, this.cT);
    }

    public final efxc au() {
        return ((efxf) ((lmw) this.cl.b()).a(efxf.class)).f;
    }

    final efzy av() {
        fbbf fbbfVar = this.bR;
        enhd h = enhk.h(14);
        h.k(efvj.class, fbbfVar);
        h.k(efxf.class, this.bX);
        h.k(efxz.class, this.bY);
        h.k(efyz.class, this.bZ);
        h.k(efzi.class, this.ca);
        h.k(egle.class, this.cb);
        h.k(egko.class, this.cc);
        h.k(egmy.class, this.cd);
        h.k(egkx.class, this.ce);
        h.k(egnt.class, this.cf);
        h.k(egpq.class, this.cj);
        h.k(egpm.class, this.cn);
        h.k(egpw.class, this.co);
        h.k(egjk.class, this.cp);
        return new efzy(h.c());
    }

    final egac aw() {
        return new egac((Context) this.b.q.b());
    }

    public final egad ax() {
        return new egad((Context) this.b.q.b());
    }

    final egds ay() {
        emxc j = emxc.j(new egej((errl) this.b.aK.b(), (egdu) this.by.b(), (egct) this.bA.b(), (egdg) this.bF.b(), new egeh(this.bL, this.b.aK, this.bM, this.bN)));
        akis akisVar = this.b;
        fbbf fbbfVar = akisVar.aK;
        fbbf fbbfVar2 = this.by;
        fbbf fbbfVar3 = this.bA;
        fbbf fbbfVar4 = this.bF;
        return new egds(j, new egif(fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, this.bO), new eghv(this.bP, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4), new eghn(akisVar.q, fbbfVar));
    }

    final egdw az() {
        akis akisVar = this.b;
        fbbf fbbfVar = this.bL;
        fbbf fbbfVar2 = akisVar.aK;
        fbbf fbbfVar3 = this.bM;
        fbbf fbbfVar4 = this.by;
        return new egdw(new egjb(fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, this.bA), new egiv(fbbfVar2, this.cg, this.bS, fbbfVar4, this.bz));
    }

    @Override // defpackage.elcc
    public final elbx b() {
        return (elbx) this.b.aJ.b();
    }

    final Object ba() {
        emxc aT = aT();
        ekki ekkiVar = (ekki) this.n.b();
        return aT.g() ? new eiuj((eg) aT.c(), ekkiVar) : new eiui(ekkiVar);
    }

    final Object bb() {
        return new eknh((ekyo) this.T.b());
    }

    final Map bc() {
        enhd h = enhk.h(17);
        h.k(aemb.AUDIO, new aehe());
        h.k(aemb.AVATAR, N());
        h.k(aemb.NAME, Q());
        h.k(aemb.SNIPPET, R());
        h.k(aemb.SUBJECT, T());
        h.k(aemb.TIMESTAMP, U());
        h.k(aemb.NOTIFICATION_BELL, new aejk());
        h.k(aemb.WORK_PROFILE_ICON, new aekb());
        h.k(aemb.REMINDER, new aejr((Context) this.d.b(), (cqoh) this.b.cz.b()));
        h.k(aemb.NUDGE, new aiso((Context) this.d.b(), (cjdi) this.b.jC.b(), (cjdj) this.b.lB.b(), (ctjh) this.b.a.nE.b()));
        h.k(aemb.BIRTHDAY, new sus((Context) this.d.b(), (ffsk) this.b.a.p.b(), this.b.b.h(), (stm) this.aj.b()));
        h.k(aemb.OTP, new aejn((cqoh) this.b.cz.b(), this.b.a.rg));
        h.k(aemb.CONTENT_DESCRIPTION, O());
        h.k(aemb.UNREAD_BADGE, V());
        h.k(aemb.PIN_TO_TOP, new aejo());
        h.k(aemb.STATUS, S());
        h.k(aemb.SCHEDULED_MESSAGE, new aktm((Context) this.d.b()));
        return h.c();
    }

    @Override // defpackage.elcc
    public final Set bd() {
        return enpd.a;
    }

    final Set be() {
        eivv eivvVar = (eivv) this.b.b.nJ.b();
        emxc aS = aS();
        return enip.r(eivvVar, aS.g() ? new eitd(aS) : new eite());
    }

    final efzv bf() {
        return new efzv((Context) this.b.q.b());
    }

    @Override // fbae.a
    public final akgp bg() {
        return new akgp(this.b, this.c, this.dn);
    }

    @Override // fbal.b
    public final akkx bh() {
        return new akkx(this.b, this.c, this.dn);
    }

    final void bj() {
    }

    @Override // ekky.c
    public final ekjq bk() {
        return new ekjq(aS(), new ekjm((ekjr) this.b.b.gh.b(), aS(), (ekki) this.n.b()), (ekki) this.n.b());
    }

    @Override // defpackage.ugt
    public final uhb c() {
        return (uhb) this.z.b();
    }

    @Override // defpackage.ugv
    public final uhd d() {
        return (uhd) this.A.b();
    }

    @Override // defpackage.ulv
    public final uij e() {
        return (uij) this.B.b();
    }

    @Override // defpackage.upi
    public final uph f() {
        return (uph) this.D.b();
    }

    @Override // defpackage.vyu
    public final vyx g() {
        return (vyx) this.E.b();
    }

    @Override // defpackage.wff
    public final wfj h() {
        return (wfj) this.F.b();
    }

    @Override // defpackage.adih
    public final adhr i() {
        return (adhr) this.O.b();
    }

    @Override // defpackage.aegh
    public final aegg j() {
        return (aegg) this.ae.b();
    }

    @Override // defpackage.aejp
    public final aeix k() {
        return (aeix) this.an.b();
    }

    @Override // defpackage.aemh
    public final aemc l() {
        return (aemc) this.ao.b();
    }

    @Override // defpackage.ahgp
    public final ahgo m() {
        return new ahgo();
    }

    @Override // defpackage.ahku
    public final ahkc n() {
        return (ahkc) this.aq.b();
    }

    @Override // defpackage.ahrd
    public final ahrb o() {
        return (ahrb) this.aO.b();
    }

    @Override // defpackage.aitu
    public final aitp p() {
        return (aitp) this.aR.b();
    }

    @Override // defpackage.aitv
    public final aitt q() {
        return (aitt) this.aT.b();
    }

    @Override // defpackage.aiun
    public final aium r() {
        return (aium) this.aU.b();
    }

    @Override // defpackage.ajma
    public final ajlz s() {
        return (ajlz) this.aW.b();
    }

    final acio t() {
        return acxg.a(this.b.dQ, fbaz.a(this.aJ));
    }

    final adkl u() {
        return new adkl(this.w);
    }

    final adkx v() {
        return new adkx((akzt) this.b.a.C.b());
    }

    final adlb w() {
        return new adlb((Activity) this.d.b(), (elbx) this.b.aJ.b(), v(), this.cZ);
    }

    final adld x() {
        return new adld((Activity) this.d.b(), (elbx) this.b.aJ.b(), this.db, this.dc);
    }

    final adli y() {
        Activity activity = (Activity) this.d.b();
        elbx elbxVar = (elbx) this.b.aJ.b();
        akkp akkpVar = this.b.a;
        fbbf fbbfVar = this.aK;
        return new adli(activity, elbxVar, v(), fbaz.a(fbbfVar), this.cZ, fbaz.a(akkpVar.eY));
    }

    final adlk z() {
        return new adlk((Activity) this.d.b(), (elbx) this.b.aJ.b(), v(), this.cZ);
    }

    @Override // defpackage.ebce
    public final void bi() {
    }
}
