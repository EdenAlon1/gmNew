package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeyc extends aeyp {
    public final MessageIdType a;
    public final SuperSortLabel b;
    public final String c;
    public final buay d;
    public final buax e;
    public final String f;
    public final boolean g;

    public aeyc(MessageIdType messageIdType, SuperSortLabel superSortLabel, String str, buay buayVar, buax buaxVar, String str2, boolean z) {
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.a = messageIdType;
        if (superSortLabel == null) {
            throw new NullPointerException("Null label");
        }
        this.b = superSortLabel;
        if (str == null) {
            throw new NullPointerException("Null intent");
        }
        this.c = str;
        if (buayVar == null) {
            throw new NullPointerException("Null source");
        }
        this.d = buayVar;
        if (buaxVar == null) {
            throw new NullPointerException("Null confidence");
        }
        this.e = buaxVar;
        if (str2 == null) {
            throw new NullPointerException("Null modelId");
        }
        this.f = str2;
        this.g = z;
    }

    @Override // defpackage.aeyp
    public final SuperSortLabel a() {
        return this.b;
    }

    @Override // defpackage.aeyp
    public final MessageIdType b() {
        return this.a;
    }

    @Override // defpackage.aeyp
    public final buax c() {
        return this.e;
    }

    @Override // defpackage.aeyp
    public final buay d() {
        return this.d;
    }

    @Override // defpackage.aeyp
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeyp) {
            aeyp aeypVar = (aeyp) obj;
            if (this.a.equals(aeypVar.b()) && this.b.equals(aeypVar.a()) && this.c.equals(aeypVar.e()) && this.d.equals(aeypVar.d()) && this.e.equals(aeypVar.c()) && this.f.equals(aeypVar.f()) && this.g == aeypVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aeyp
    public final String f() {
        return this.f;
    }

    @Override // defpackage.aeyp
    public final boolean g() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true != this.g ? 1237 : 1231);
    }

    public final String toString() {
        buax buaxVar = this.e;
        buay buayVar = this.d;
        SuperSortLabel superSortLabel = this.b;
        return "SetLabelParams{messageId=" + this.a.toString() + ", label=" + superSortLabel.toString() + ", intent=" + this.c + ", source=" + buayVar.toString() + ", confidence=" + buaxVar.toString() + ", modelId=" + this.f + ", triggeredByNewMessage=" + this.g + "}";
    }
}
