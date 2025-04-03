package defpackage;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pzn {
    public static final int a(poa poaVar) {
        poaVar.getClass();
        int ordinal = poaVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 1;
        }
        throw new ffcd();
    }

    public static final int b(pqg pqgVar) {
        pqgVar.getClass();
        int ordinal = pqgVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 1;
        }
        throw new ffcd();
    }

    public static final int c(pqp pqpVar) {
        pqpVar.getClass();
        int ordinal = pqpVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        throw new ffcd();
                    }
                }
            }
        }
        return i;
    }

    public static final poa d(int i) {
        if (i == 0) {
            return poa.EXPONENTIAL;
        }
        if (i == 1) {
            return poa.LINEAR;
        }
        throw new IllegalArgumentException(a.f(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static final pqg e(int i) {
        if (i == 0) {
            return pqg.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i == 1) {
            return pqg.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException(a.f(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final pqp f(int i) {
        if (i == 0) {
            return pqp.ENQUEUED;
        }
        if (i == 1) {
            return pqp.RUNNING;
        }
        if (i == 2) {
            return pqp.SUCCEEDED;
        }
        if (i == 3) {
            return pqp.FAILED;
        }
        if (i == 4) {
            return pqp.BLOCKED;
        }
        if (i == 5) {
            return pqp.CANCELLED;
        }
        throw new IllegalArgumentException(a.f(i, "Could not convert ", " to State"));
    }

    public static final qad g(byte[] bArr) {
        bArr.getClass();
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new qad((Object) null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                int[] iArr = new int[readInt];
                for (int i = 0; i < readInt; i++) {
                    iArr[i] = objectInputStream.readInt();
                }
                int readInt2 = objectInputStream.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i2 = 0; i2 < readInt2; i2++) {
                    iArr2[i2] = objectInputStream.readInt();
                }
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                for (int i3 = 0; i3 < readInt2; i3++) {
                    int i4 = iArr2[i3];
                    try {
                        builder.addCapability(i4);
                    } catch (IllegalArgumentException e) {
                        ppt.c();
                        Log.w(qad.a, "Ignoring adding capability '" + i4 + '\'', e);
                    }
                }
                for (int i5 = 0; i5 < readInt; i5++) {
                    builder.addTransportType(iArr[i5]);
                }
                NetworkRequest build = builder.build();
                build.getClass();
                qad qadVar = new qad(build);
                ffig.a(objectInputStream, null);
                ffig.a(byteArrayInputStream, null);
                return qadVar;
            } finally {
            }
        } finally {
        }
    }

    public static final Set h(byte[] bArr) {
        ObjectInputStream objectInputStream;
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                int readInt = objectInputStream.readInt();
                for (int i = 0; i < readInt; i++) {
                    Uri parse = Uri.parse(objectInputStream.readUTF());
                    boolean readBoolean = objectInputStream.readBoolean();
                    parse.getClass();
                    linkedHashSet.add(new poi(parse, readBoolean));
                }
                ffig.a(objectInputStream, null);
                ffig.a(byteArrayInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }

    public static final byte[] i(qad qadVar) {
        Object obj;
        int[] ax;
        boolean hasTransport;
        int[] ax2;
        boolean hasCapability;
        if (Build.VERSION.SDK_INT < 28 || (obj = qadVar.b) == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    ax = ((NetworkRequest) obj).getTransportTypes();
                    ax.getClass();
                } else {
                    int[] iArr = {2, 0, 3, 6, 9, 8, 4, 1, 5};
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < 9; i++) {
                        int i2 = iArr[i];
                        hasTransport = ((NetworkRequest) obj).hasTransport(i2);
                        if (hasTransport) {
                            arrayList.add(Integer.valueOf(i2));
                        }
                    }
                    ax = ffdx.ax(arrayList);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    ax2 = ((NetworkRequest) obj).getCapabilities();
                    ax2.getClass();
                } else {
                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < 29; i3++) {
                        int i4 = iArr2[i3];
                        hasCapability = ((NetworkRequest) obj).hasCapability(i4);
                        if (hasCapability) {
                            arrayList2.add(Integer.valueOf(i4));
                        }
                    }
                    ax2 = ffdx.ax(arrayList2);
                }
                objectOutputStream.writeInt(ax.length);
                for (int i5 : ax) {
                    objectOutputStream.writeInt(i5);
                }
                objectOutputStream.writeInt(ax2.length);
                for (int i6 : ax2) {
                    objectOutputStream.writeInt(i6);
                }
                ffig.a(objectOutputStream, null);
                ffig.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final byte[] j(Set set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    poi poiVar = (poi) it.next();
                    objectOutputStream.writeUTF(poiVar.a.toString());
                    objectOutputStream.writeBoolean(poiVar.b);
                }
                ffig.a(objectOutputStream, null);
                ffig.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int k(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 0;
        }
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    i3 = 4;
                    if (i2 != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && i == 6) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + ((Object) ppu.a(i)) + " to int");
                    }
                }
            }
        }
        return i3;
    }

    public static final int l(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(a.f(i, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }
}
