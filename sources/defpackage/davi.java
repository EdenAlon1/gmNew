package defpackage;

import android.content.Context;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class davi extends cslh {
    public static final /* synthetic */ int y = 0;
    final /* synthetic */ ProgressBar a;
    final /* synthetic */ int b;
    final /* synthetic */ TextView c;
    final /* synthetic */ int k;
    final /* synthetic */ String l;
    final /* synthetic */ covs m;
    final /* synthetic */ Map n;
    final /* synthetic */ int o;
    final /* synthetic */ Random p;
    final /* synthetic */ long q;
    final /* synthetic */ String r;
    final /* synthetic */ String[] s;
    final /* synthetic */ long t;
    final /* synthetic */ Context u;
    final /* synthetic */ Context v;
    final /* synthetic */ int w;
    final /* synthetic */ davk x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public davi(davk davkVar, ProgressBar progressBar, int i, TextView textView, int i2, String str, covs covsVar, Map map, int i3, Random random, long j, String str2, String[] strArr, long j2, Context context, Context context2, int i4) {
        super("Bugle.Async.Debug.createFakeTelephonyConversations.Duration", null);
        this.a = progressBar;
        this.b = i;
        this.c = textView;
        this.k = i2;
        this.l = str;
        this.m = covsVar;
        this.n = map;
        this.o = i3;
        this.p = random;
        this.q = j;
        this.r = str2;
        this.s = strArr;
        this.t = j2;
        this.u = context;
        this.v = context2;
        this.w = i4;
        this.x = davkVar;
    }

    private final Integer c() {
        return (Integer) this.n.keySet().toArray()[this.p.nextInt(this.n.size())];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0321 A[Catch: all -> 0x03b7, TryCatch #3 {all -> 0x03b7, blocks: (B:3:0x003b, B:5:0x0040, B:7:0x0044, B:9:0x0054, B:13:0x0070, B:17:0x0077, B:19:0x007b, B:21:0x0087, B:22:0x0108, B:24:0x0133, B:26:0x013b, B:27:0x01bf, B:30:0x01cc, B:32:0x01f1, B:34:0x02ac, B:37:0x02af, B:38:0x02bf, B:39:0x031b, B:41:0x0321, B:43:0x0349, B:46:0x0359, B:45:0x0366, B:51:0x02b8, B:55:0x02df, B:57:0x02f2, B:59:0x02fc, B:60:0x030f, B:62:0x0191, B:63:0x0094, B:65:0x00ab, B:67:0x00ec, B:68:0x00c9, B:70:0x00d8, B:72:0x0376, B:74:0x0382, B:76:0x0396, B:77:0x03a6), top: B:2:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0366 A[SYNTHETIC] */
    @Override // defpackage.cslh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* synthetic */ java.lang.Object a(java.lang.Object[] r58) {
        /*
            Method dump skipped, instructions count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.davi.a(java.lang.Object[]):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onProgressUpdate(Integer... numArr) {
        if (numArr == null || numArr.length < 2 || this.a == null || this.c == null) {
            return;
        }
        Integer num = numArr[0];
        int intValue = num.intValue();
        Integer num2 = numArr[1];
        this.c.setText(intValue < num2.intValue() ? String.format(Locale.US, "Progress... %d/%d msgs", num, num2) : "Progress... done!");
        this.a.setProgress(intValue, true);
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        onProgressUpdate(Integer.valueOf(this.b), Integer.valueOf(this.b));
        this.x.k.l("Telephony DB populated. Now syncing...");
        efbd.d(new Runnable() { // from class: davh
            @Override // java.lang.Runnable
            public final void run() {
                ((coxg) davi.this.x.j.b()).k(eqqh.FAKE_MESSAGE_GENERATOR);
            }
        }, 5000L);
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        ProgressBar progressBar = this.a;
        if (progressBar != null) {
            progressBar.setMax(this.b);
        }
        onProgressUpdate(0, Integer.valueOf(this.b));
    }
}
