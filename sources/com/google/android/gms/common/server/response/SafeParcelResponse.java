package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.a;
import defpackage.dfwv;
import defpackage.dfxi;
import defpackage.dfxj;
import defpackage.dfxk;
import defpackage.dfyg;
import defpackage.dfyj;
import defpackage.dfyk;
import defpackage.dfyu;
import defpackage.dfyv;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new dfyg();
    public final int a;
    public final FieldMappingDictionary b;
    private final Parcel c;
    private final String d;
    private int e;
    private int f;

    public SafeParcelResponse(int i, Parcel parcel, FieldMappingDictionary fieldMappingDictionary) {
        this.a = i;
        dfwv.n(parcel);
        this.c = parcel;
        this.b = fieldMappingDictionary;
        this.d = fieldMappingDictionary == null ? null : fieldMappingDictionary.b;
        this.e = 2;
    }

    private final void h(StringBuilder sb, Map map, Parcel parcel) {
        BigInteger[] bigIntegerArr;
        BigDecimal[] bigDecimalArr;
        boolean[] createBooleanArray;
        Parcel[] parcelArr;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).g, entry);
        }
        sb.append('{');
        int h = dfxj.h(parcel);
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get(dfxj.d(readInt));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (field.k != null) {
                    int i = field.d;
                    switch (i) {
                        case 0:
                            j(sb, field, e(field, Integer.valueOf(dfxj.f(parcel, readInt))));
                            break;
                        case 1:
                            j(sb, field, e(field, dfxj.v(parcel, readInt)));
                            break;
                        case 2:
                            j(sb, field, e(field, Long.valueOf(dfxj.i(parcel, readInt))));
                            break;
                        case 3:
                            j(sb, field, e(field, Float.valueOf(dfxj.c(parcel, readInt))));
                            break;
                        case 4:
                            j(sb, field, e(field, Double.valueOf(dfxj.b(parcel, readInt))));
                            break;
                        case 5:
                            j(sb, field, e(field, dfxj.u(parcel, readInt)));
                            break;
                        case 6:
                            j(sb, field, e(field, Boolean.valueOf(dfxj.D(parcel, readInt))));
                            break;
                        case 7:
                            j(sb, field, e(field, dfxj.t(parcel, readInt)));
                            break;
                        case 8:
                        case 9:
                            j(sb, field, e(field, dfxj.E(parcel, readInt)));
                            break;
                        case 10:
                            Bundle k = dfxj.k(parcel, readInt);
                            HashMap hashMap = new HashMap();
                            for (String str2 : k.keySet()) {
                                String string = k.getString(str2);
                                dfwv.n(string);
                                hashMap.put(str2, string);
                            }
                            j(sb, field, e(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(a.h(i, "Unknown field out type = "));
                    }
                } else if (field.e) {
                    sb.append("[");
                    switch (field.d) {
                        case 0:
                            int[] H = dfxj.H(parcel, readInt);
                            int length = H.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 != 0) {
                                    sb.append(",");
                                }
                                sb.append(H[i2]);
                            }
                            break;
                        case 1:
                            int g = dfxj.g(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (g == 0) {
                                bigIntegerArr = null;
                            } else {
                                int readInt2 = parcel.readInt();
                                bigIntegerArr = new BigInteger[readInt2];
                                for (int i3 = 0; i3 < readInt2; i3++) {
                                    bigIntegerArr[i3] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(dataPosition + g);
                            }
                            dfyj.a(sb, bigIntegerArr);
                            break;
                        case 2:
                            long[] I = dfxj.I(parcel, readInt);
                            int length2 = I.length;
                            for (int i4 = 0; i4 < length2; i4++) {
                                if (i4 != 0) {
                                    sb.append(",");
                                }
                                sb.append(I[i4]);
                            }
                            break;
                        case 3:
                            float[] G = dfxj.G(parcel, readInt);
                            int length3 = G.length;
                            for (int i5 = 0; i5 < length3; i5++) {
                                if (i5 != 0) {
                                    sb.append(",");
                                }
                                sb.append(G[i5]);
                            }
                            break;
                        case 4:
                            double[] F = dfxj.F(parcel, readInt);
                            int length4 = F.length;
                            for (int i6 = 0; i6 < length4; i6++) {
                                if (i6 != 0) {
                                    sb.append(",");
                                }
                                sb.append(F[i6]);
                            }
                            break;
                        case 5:
                            int g2 = dfxj.g(parcel, readInt);
                            int dataPosition2 = parcel.dataPosition();
                            if (g2 == 0) {
                                bigDecimalArr = null;
                            } else {
                                int readInt3 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[readInt3];
                                for (int i7 = 0; i7 < readInt3; i7++) {
                                    bigDecimalArr[i7] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                }
                                parcel.setDataPosition(dataPosition2 + g2);
                            }
                            dfyj.a(sb, bigDecimalArr);
                            break;
                        case 6:
                            int g3 = dfxj.g(parcel, readInt);
                            int dataPosition3 = parcel.dataPosition();
                            if (g3 == 0) {
                                createBooleanArray = null;
                            } else {
                                createBooleanArray = parcel.createBooleanArray();
                                parcel.setDataPosition(dataPosition3 + g3);
                            }
                            int length5 = createBooleanArray.length;
                            for (int i8 = 0; i8 < length5; i8++) {
                                if (i8 != 0) {
                                    sb.append(",");
                                }
                                sb.append(createBooleanArray[i8]);
                            }
                            break;
                        case 7:
                            String[] K = dfxj.K(parcel, readInt);
                            int length6 = K.length;
                            for (int i9 = 0; i9 < length6; i9++) {
                                if (i9 != 0) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(K[i9]);
                                sb.append("\"");
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            int g4 = dfxj.g(parcel, readInt);
                            int dataPosition4 = parcel.dataPosition();
                            if (g4 == 0) {
                                parcelArr = null;
                            } else {
                                int readInt4 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[readInt4];
                                for (int i10 = 0; i10 < readInt4; i10++) {
                                    int readInt5 = parcel.readInt();
                                    if (readInt5 != 0) {
                                        int dataPosition5 = parcel.dataPosition();
                                        Parcel obtain = Parcel.obtain();
                                        obtain.appendFrom(parcel, dataPosition5, readInt5);
                                        parcelArr2[i10] = obtain;
                                        parcel.setDataPosition(dataPosition5 + readInt5);
                                    } else {
                                        parcelArr2[i10] = null;
                                    }
                                }
                                parcel.setDataPosition(dataPosition4 + g4);
                                parcelArr = parcelArr2;
                            }
                            int length7 = parcelArr.length;
                            for (int i11 = 0; i11 < length7; i11++) {
                                if (i11 > 0) {
                                    sb.append(",");
                                }
                                parcelArr[i11].setDataPosition(0);
                                h(sb, field.b(), parcelArr[i11]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.d) {
                        case 0:
                            sb.append(dfxj.f(parcel, readInt));
                            break;
                        case 1:
                            sb.append(dfxj.v(parcel, readInt));
                            break;
                        case 2:
                            sb.append(dfxj.i(parcel, readInt));
                            break;
                        case 3:
                            sb.append(dfxj.c(parcel, readInt));
                            break;
                        case 4:
                            sb.append(dfxj.b(parcel, readInt));
                            break;
                        case 5:
                            sb.append(dfxj.u(parcel, readInt));
                            break;
                        case 6:
                            sb.append(dfxj.D(parcel, readInt));
                            break;
                        case 7:
                            String t = dfxj.t(parcel, readInt);
                            sb.append("\"");
                            sb.append(dfyu.a(t));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] E = dfxj.E(parcel, readInt);
                            sb.append("\"");
                            sb.append(dfyk.a(E));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] E2 = dfxj.E(parcel, readInt);
                            sb.append("\"");
                            sb.append(dfyk.b(E2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle k2 = dfxj.k(parcel, readInt);
                            Set<String> keySet = k2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str3 : keySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str3);
                                sb.append("\":\"");
                                sb.append(dfyu.a(k2.getString(str3)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel m = dfxj.m(parcel, readInt);
                            m.setDataPosition(0);
                            h(sb, field.b(), m);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() != h) {
            throw new dfxi(a.h(h, "Overread allowed size end="), parcel);
        }
        sb.append('}');
    }

    private static final void i(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                dfwv.n(obj);
                sb.append(dfyu.a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(dfyk.a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(dfyk.b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                dfwv.n(obj);
                dfyv.a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(a.h(i, "Unknown type = "));
        }
    }

    private static final void j(StringBuilder sb, FastJsonResponse.Field field, Object obj) {
        if (!field.c) {
            i(sb, field.b, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(",");
            }
            i(sb, field.b, arrayList.get(i));
        }
        sb.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map b() {
        FieldMappingDictionary fieldMappingDictionary = this.b;
        if (fieldMappingDictionary == null) {
            return null;
        }
        String str = this.d;
        dfwv.n(str);
        return fieldMappingDictionary.a(str);
    }

    public final Parcel d() {
        int i = this.e;
        if (i == 0) {
            int a = dfxk.a(this.c);
            this.f = a;
            dfxk.c(this.c, a);
            this.e = 2;
        } else if (i == 1) {
            dfxk.c(this.c, this.f);
            this.e = 2;
        }
        return this.c;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final void f() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final void g() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        dfwv.o(this.b, "Cannot convert to JSON on client side.");
        Parcel d = d();
        d.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.d;
        dfwv.n(str);
        Map a = this.b.a(str);
        dfwv.n(a);
        h(sb, a, d);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        Parcel d = d();
        int b = dfxk.b(parcel, 2);
        parcel.appendFrom(d, 0, d.dataSize());
        dfxk.c(parcel, b);
        dfxk.k(parcel, 3, this.b, i, false);
        dfxk.c(parcel, a);
    }
}
