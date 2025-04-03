package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enno extends enbk {
    private static final long serialVersionUID = 0;
    transient emyl c;

    public enno(Map map, emyl emylVar) {
        super(map);
        this.c = emylVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        readObject.getClass();
        this.c = (emyl) readObject;
        Object readObject2 = objectInputStream.readObject();
        readObject2.getClass();
        r((Map) readObject2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        objectOutputStream.writeObject(((encd) this).a);
    }

    @Override // defpackage.enbk, defpackage.encd
    public final /* bridge */ /* synthetic */ Collection a() {
        return (List) this.c.get();
    }

    @Override // defpackage.encd, defpackage.encm
    public final Map o() {
        Map map = ((encd) this).a;
        return map instanceof NavigableMap ? new enbt(this, (NavigableMap) map) : map instanceof SortedMap ? new enbw(this, (SortedMap) map) : new enbp(this, map);
    }

    @Override // defpackage.encd, defpackage.encm
    public final Set p() {
        Map map = ((encd) this).a;
        return map instanceof NavigableMap ? new enbu(this, (NavigableMap) map) : map instanceof SortedMap ? new enbx(this, (SortedMap) map) : new enbs(this, map);
    }
}
