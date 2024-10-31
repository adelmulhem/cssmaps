export default function App(){
    const Array = ['Item 1', 'Item 2', 'Item 3'] 
    return (
        <>
          {Array.length === 0 ? (
            <p>لا توجد عناصر في المصفوفة.</p>
          ) : (
            <ul>
              {Array.map((item, index) => (
                <li key={index}>{item}</li>
              ))}
            </ul>
          )}
        </>
      );
    
}