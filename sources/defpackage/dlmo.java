package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlmo extends dllp {
    public dlmo() {
        super(dexf.SEND_BROADCAST, 10L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dllp
    public final dllv a(dllv dllvVar, emxc emxcVar) {
        if (!emxcVar.g() || ((deyi) emxcVar.c()).b != 3) {
            throw new IllegalArgumentException();
        }
        deyi deyiVar = (deyi) emxcVar.c();
        deyb deybVar = deyiVar.b == 3 ? (deyb) deyiVar.c : deyb.a;
        String packageName = dllvVar.b.getPackageName();
        Intent intent = new Intent().setPackage(packageName);
        if ((deybVar.b & 1) != 0) {
            intent.setAction(deybVar.c);
        }
        if ((deybVar.b & 2) != 0) {
            intent.setComponent(new ComponentName(packageName, deybVar.d));
        }
        if ((deybVar.b & 4) != 0) {
            intent.setData(Uri.parse(deybVar.e));
        }
        Iterator<E> it = deybVar.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                List<ResolveInfo> queryBroadcastReceivers = dllvVar.b.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
                    throw new IllegalStateException("No receiver for intent. ".concat(String.valueOf(String.valueOf(intent))));
                }
                Log.d("SEND_BROADCAST_FIX", "Broadcasting: intent=".concat(String.valueOf(String.valueOf(intent))));
                dllvVar.b.sendBroadcast(intent);
                return dllvVar;
            }
            dexv dexvVar = (dexv) it.next();
            int a = dexu.a(dexvVar.e);
            if (a == 0) {
                a = 1;
            }
            switch (a - 2) {
                case 0:
                    throw new IllegalArgumentException("Can't assign unknown extra");
                case 1:
                    intent.putExtra(dexvVar.d, dexvVar.b == 3 ? (String) dexvVar.c : "");
                    break;
                case 2:
                    intent.putExtra(dexvVar.d, (byte) (dexvVar.b == 4 ? ((Integer) dexvVar.c).intValue() : 0));
                    break;
                case 3:
                    intent.putExtra(dexvVar.d, (short) (dexvVar.b == 5 ? ((Integer) dexvVar.c).intValue() : 0));
                    break;
                case 4:
                    intent.putExtra(dexvVar.d, dexvVar.b == 6 ? ((Integer) dexvVar.c).intValue() : 0);
                    break;
                case 5:
                    intent.putExtra(dexvVar.d, dexvVar.b == 7 ? ((Long) dexvVar.c).longValue() : 0L);
                    break;
                case 6:
                    intent.putExtra(dexvVar.d, dexvVar.b == 8 ? ((Float) dexvVar.c).floatValue() : 0.0f);
                    break;
                case 7:
                    intent.putExtra(dexvVar.d, dexvVar.b == 9 ? ((Double) dexvVar.c).doubleValue() : eobe.a);
                    break;
                case 8:
                    intent.putExtra(dexvVar.d, dexvVar.b == 10 ? ((Boolean) dexvVar.c).booleanValue() : false);
                    break;
                case 9:
                    String[] strArr = new String[dexvVar.f.size()];
                    for (int i = 0; i < dexvVar.f.size(); i++) {
                        strArr[i] = (String) dexvVar.f.get(i);
                    }
                    intent.putExtra(dexvVar.d, strArr);
                    break;
                case 10:
                    byte[] bArr = new byte[dexvVar.g.size()];
                    for (int i2 = 0; i2 < dexvVar.g.size(); i2++) {
                        bArr[i2] = (byte) dexvVar.g.d(i2);
                    }
                    intent.putExtra(dexvVar.d, bArr);
                    break;
                case 11:
                    short[] sArr = new short[dexvVar.h.size()];
                    for (int i3 = 0; i3 < dexvVar.h.size(); i3++) {
                        sArr[i3] = (short) dexvVar.h.d(i3);
                    }
                    intent.putExtra(dexvVar.d, sArr);
                    break;
                case 12:
                    int[] iArr = new int[dexvVar.i.size()];
                    for (int i4 = 0; i4 < dexvVar.i.size(); i4++) {
                        iArr[i4] = dexvVar.i.d(i4);
                    }
                    intent.putExtra(dexvVar.d, iArr);
                    break;
                case 13:
                    long[] jArr = new long[dexvVar.j.size()];
                    for (int i5 = 0; i5 < dexvVar.j.size(); i5++) {
                        jArr[i5] = dexvVar.j.a(i5);
                    }
                    intent.putExtra(dexvVar.d, jArr);
                    break;
                case 14:
                    float[] fArr = new float[dexvVar.k.size()];
                    for (int i6 = 0; i6 < dexvVar.k.size(); i6++) {
                        fArr[i6] = dexvVar.k.d(i6);
                    }
                    intent.putExtra(dexvVar.d, fArr);
                    break;
                case 15:
                    double[] dArr = new double[dexvVar.l.size()];
                    for (int i7 = 0; i7 < dexvVar.l.size(); i7++) {
                        dArr[i7] = dexvVar.l.d(i7);
                    }
                    intent.putExtra(dexvVar.d, dArr);
                    break;
                case 16:
                    boolean[] zArr = new boolean[dexvVar.m.size()];
                    for (int i8 = 0; i8 < dexvVar.m.size(); i8++) {
                        zArr[i8] = dexvVar.m.g(i8);
                    }
                    intent.putExtra(dexvVar.d, zArr);
                    break;
                default:
                    throw new IllegalArgumentException("Unrecognized extra type");
            }
        }
    }

    @Override // defpackage.dllp
    public final String b() {
        return "SEND_BROADCAST_FIX";
    }
}
